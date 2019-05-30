package JDBC;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/redes", "root", "");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR SQL");
            throw new SQLException(ex.getMessage());
        }

    }

}
