package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionViajes {

    private static final String URL = "jdbc:mysql://localhost:3306/viajes?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "root"; // tu usuario de MySQL
    private static final String PASSWORD = "cristancho18"; // tu contraseña
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static Connection connection;

    public static Connection getConexion() {
        try {
            Class.forName(DRIVER);
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conectado a la base de datos viajes");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver JDBC de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos viajes: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

    public static void cerrarConexion() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión a viajes cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión a viajes: " + e.getMessage());
        }
    }
}
