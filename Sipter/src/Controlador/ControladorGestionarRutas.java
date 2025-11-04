package Controlador;

import Modelo.ConexionSql;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorGestionarRutas {

    @FXML private TableView<Ruta> tablaRutas;
    @FXML private TableColumn<Ruta, Integer> colId;
    @FXML private TableColumn<Ruta, String> colOrigen;
    @FXML private TableColumn<Ruta, String> colDestino;
    @FXML private TableColumn<Ruta, Double> colTarifa;
    @FXML private TableColumn<Ruta, String> colConductor;
    @FXML private TableColumn<Ruta, String> colVehiculo;

    private ObservableList<Ruta> listaRutas = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));

        colOrigen.setCellValueFactory(new PropertyValueFactory<>("origen"));
        colOrigen.setCellFactory(TextFieldTableCell.forTableColumn());
        colOrigen.setOnEditCommit(event -> event.getRowValue().setOrigen(event.getNewValue()));

        colDestino.setCellValueFactory(new PropertyValueFactory<>("destino"));
        colDestino.setCellFactory(TextFieldTableCell.forTableColumn());
        colDestino.setOnEditCommit(event -> event.getRowValue().setDestino(event.getNewValue()));

        colTarifa.setCellValueFactory(new PropertyValueFactory<>("tarifa"));
        colTarifa.setCellFactory(TextFieldTableCell.forTableColumn(new javafx.util.converter.DoubleStringConverter()));
        colTarifa.setOnEditCommit(event -> event.getRowValue().setTarifa(event.getNewValue()));

        colConductor.setCellValueFactory(new PropertyValueFactory<>("conductor"));
        colVehiculo.setCellValueFactory(new PropertyValueFactory<>("vehiculo"));

        cargarRutas();
    }

    private void cargarRutas() {
        listaRutas.clear();
        String sql = """
                SELECT r.id_ruta, r.origen, r.destino, r.tarifa,
                       c.nombre AS conductor, v.modelo AS vehiculo
                FROM rutas r
                LEFT JOIN viajes_conductores vc ON r.id_ruta = vc.id
                LEFT JOIN conductores c ON vc.id_conductor = c.id
                LEFT JOIN vehiculos v ON vc.id_conductor = v.id
                """;

        try (Connection conn = ConexionSql.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                listaRutas.add(new Ruta(
                        rs.getInt("id_ruta"),
                        rs.getString("origen"),
                        rs.getString("destino"),
                        rs.getDouble("tarifa"),
                        rs.getString("conductor"),
                        rs.getString("vehiculo")
                ));
            }

            tablaRutas.setItems(listaRutas);

        } catch (SQLException e) {
            mostrarMensaje("Error al cargar rutas: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    private void guardarCambios() {
        String sql = "UPDATE rutas SET origen = ?, destino = ?, tarifa = ? WHERE id_ruta = ?";

        try (Connection conn = ConexionSql.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            for (Ruta ruta : listaRutas) {
                ps.setString(1, ruta.getOrigen());
                ps.setString(2, ruta.getDestino());
                ps.setDouble(3, ruta.getTarifa());
                ps.setInt(4, ruta.getId());
                ps.addBatch();
            }

            ps.executeBatch();
            mostrarMensaje("Cambios guardados correctamente.");

        } catch (SQLException e) {
            mostrarMensaje("Error al guardar cambios: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Gestionar Rutas");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public static class Ruta {
        private Integer id;
        private String origen;
        private String destino;
        private Double tarifa;
        private final String conductor;
        private final String vehiculo;

        public Ruta(int id, String origen, String destino, double tarifa, String conductor, String vehiculo) {
            this.id = id;
            this.origen = origen;
            this.destino = destino;
            this.tarifa = tarifa;
            this.conductor = conductor != null ? conductor : "Sin asignar";
            this.vehiculo = vehiculo != null ? vehiculo : "Sin asignar";
        }

        public Integer getId() { return id; }
        public String getOrigen() { return origen; }
        public void setOrigen(String origen) { this.origen = origen; }
        public String getDestino() { return destino; }
        public void setDestino(String destino) { this.destino = destino; }
        public Double getTarifa() { return tarifa; }
        public void setTarifa(Double tarifa) { this.tarifa = tarifa; }
        public String getConductor() { return conductor; }
        public String getVehiculo() { return vehiculo; }
    }
}
