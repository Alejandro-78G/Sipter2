package Controlador;

import Modelo.ConexionSql;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ControladorDestino {

    @FXML
    private TableView<Destino> tablaDestinos;
    @FXML
    private TableColumn<Destino, String> colCiudad;
    @FXML
    private TableColumn<Destino, String> colDireccion;
    @FXML
    private TableColumn<Destino, Double> colDistancia;

    private ObservableList<Destino> listaDestinos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        colDistancia.setCellValueFactory(new PropertyValueFactory<>("distancia"));

        cargarDestinos();
    }

    private void cargarDestinos() {
        String sql = "SELECT ciudad, direccion, distancia FROM destinos";
        try (Connection conn = ConexionSql.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                listaDestinos.add(new Destino(
                        rs.getString("ciudad"),
                        rs.getString("direccion"),
                        rs.getDouble("distancia")
                ));
            }

            tablaDestinos.setItems(listaDestinos);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al cargar los destinos desde la base de datos.");
        }
    }

    @FXML
    private void cerrarVentana() {
        Stage stage = (Stage) tablaDestinos.getScene().getWindow();
        stage.close();
    }

    public static class Destino {
        private String ciudad;
        private String direccion;
        private double distancia;

        public Destino(String ciudad, String direccion, double distancia) {
            this.ciudad = ciudad;
            this.direccion = direccion;
            this.distancia = distancia;
        }

        public String getCiudad() { return ciudad; }
        public String getDireccion() { return direccion; }
        public double getDistancia() { return distancia; }
    }
}
