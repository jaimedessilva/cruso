/**
 * 
 */
package db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author jaime Des 
 * Criado em : 6 de abr de 2020 exercicios
 */
public class ConnectionFactory {

	// Connection Method
	public static Connection getConn() {
		try {
			final String url = "jdbc:mysql://localhost:3306/DB_CRUD";
			final String user = "root";
			final String pass = "mysql";
			return DriverManager.getConnection(url, user, pass);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
