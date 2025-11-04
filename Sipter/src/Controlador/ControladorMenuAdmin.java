package Controlador;

import Modelo.ConexionSql;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorMenuAdmin {

    @FXML
    private AnchorPane root; // Referencia al AnchorPane principal

    @FXML
    private void generarReporteViajes() {
        mostrarMensaje("Reporte de viajes generado correctamente.");
    }

    @FXML
    private void generarReporteConductores() {
        mostrarMensaje("Reporte de conductores generado correctamente.");
    }

    @FXML
    private void abrirVehiculo() {
        abrirVentana("/vista/vehiculos.fxml", "Gestión de Vehículos");
    }

    @FXML
    private void inhabilitarUsuarios() {
        String sql = "UPDATE usuarios SET activo = 0 WHERE rol = 'usuario'";
        ejecutarUpdate(sql, "Usuarios inhabilitados correctamente.");
    }

    @FXML
    private void inhabilitarConductores() {
        String sql = "UPDATE usuarios SET activo = 0 WHERE rol = 'conductor'";
        ejecutarUpdate(sql, "Conductores inhabilitados correctamente.");
    }

    @FXML
    private void actualizarTarifas() {
        String sql = "UPDATE rutas SET tarifa = tarifa * 1.1"; // ejemplo: aumentar 10%
        ejecutarUpdate(sql, "Tarifas actualizadas correctamente.");
    }

    @FXML
    private void eliminarRutas() {
        abrirVentana("/vista/eliminarRutas.fxml", "Eliminar Rutas");
    }

    @FXML
    private void gestionarRutas() {
        abrirVentana("/vista/gestionarRutas.fxml", "Gestionar Rutas");
    }

    @FXML
    private void cerrarSesion() {
        try {
            // Cerrar ventana actual
            Stage stageActual = (Stage) root.getScene().getWindow();
            stageActual.close();

            // Abrir login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/login.fxml"));
            Parent rootLogin = loader.load();
            Stage stageLogin = new Stage();
            stageLogin.setTitle("Iniciar Sesión");
            stageLogin.setScene(new Scene(rootLogin));
            stageLogin.show();

        } catch (Exception e) {
            mostrarMensaje("Error al cerrar sesión: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void ejecutarUpdate(String sql, String mensajeExito) {
        try (Connection conn = ConexionSql.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            int filas = ps.executeUpdate();
            mostrarMensaje(mensajeExito + " Filas afectadas: " + filas);

        } catch (SQLException e) {
            mostrarMensaje("Error al ejecutar la operación: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Administrador");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void abrirVentana(String fxml, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

        } catch (Exception e) {
            mostrarMensaje("Error al abrir la ventana: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
