package Controlador;

import Modelo.ConexionSql;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import Modelo.ConexionSql;
import java.sql.*;

public class controLadorDelogin {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private Label lblMensaje;

    @FXML
    private void handleLogin() {
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            lblMensaje.setText(" Debes ingresar usuario y contraseña");
            return;
        }

        try (Connection conn = ConexionSql.getConexion()) {
            String sql = "SELECT * FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                lblMensaje.setText(" Bienvenido, " + usuario + "!");
            } else {
                lblMensaje.setText(" Usuario o contraseña incorrectos");
            }

        } catch (SQLException e) {
            lblMensaje.setText("Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

