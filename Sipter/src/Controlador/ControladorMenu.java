package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControladorMenu {

    public void abrirVehiculo(ActionEvent event) {
        abrirVentana("/vista/vehiculo.fxml", "Elegir Vehículo");
    }

    public void abrirConductor(ActionEvent event) {
        abrirVentana("/vista/conductor.fxml", "Elegir Conductor");
    }

    public void abrirDestino(ActionEvent event) {
        abrirVentana("/vista/destino.fxml", "Elegir Destino");
    }

    public void abrirEncuentro(ActionEvent event) {
        abrirVentana("/vista/encuentro.fxml", "Elegir Lugar de Encuentro");
    }

    private void abrirVentana(String fxml, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
