/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author jaime Des
 * Criado em : 6 de abr de 2020
 * exercicios
 */
public class TextaConexao {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		final String url = "jdbc:mysql://localhost:3306/mysql?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String pass = "mysql";
		
		Connection conn = DriverManager.getConnection(url,user, pass);
		
		System.out.println("Conexao Efetuada com sucesso!!!");
		conn.close();

	}

}
