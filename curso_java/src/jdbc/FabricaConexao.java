/**
 * 
 */
package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author jaime Des
 * Criado em : 6 de abr de 2020
 * exercicios
 */
public class FabricaConexao {
	
	public static Connection getConn () throws IOException {
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String user = prop.getProperty("banco.usuario");
			final String pass = prop.getProperty("banco.senha");
			return DriverManager.getConnection(url,user,pass);
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	private static Properties getProperties () throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
	
}
