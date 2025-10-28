package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSql {

    private static final String URL = "jdbc:mysql://localhost:3306/transporte_app";
    private static final String USER = "root";
    private static final String PASSWORD = "cristancho18";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver"; // 👈 Agregado

    private static Connection connection;

    public static Connection getConexion() {
        try {

            Class.forName(DRIVER);

            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println(" Conectado a la base de datos");
            }
        } catch (ClassNotFoundException e) {
            System.out.println(" No se encontró el driver JDBC de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(" Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

    public static void cerrarConexion() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println(" Conexión cerrada");
            }
        } catch (SQLException e) {
            System.out.println(" Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
