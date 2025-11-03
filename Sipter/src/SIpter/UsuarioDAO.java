package Modelo;

import SIpter.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public static boolean registrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, apellido, documento, tipo_documento, contrasena, nombre_usuario, ciudad, rol) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionMySql.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getApellido());
            stmt.setLong(3, usuario.getCedula());
            stmt.setString(4, usuario.getTipoDocumento());
            stmt.setString(5, usuario.getContrasena());
            stmt.setString(6, usuario.getNombreUsuario());
            stmt.setString(7, usuario.getCiudad());
            stmt.setString(8, usuario.getRol());

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al registrar el usuario: " + e.getMessage());
            return false;
        }
    }
}
