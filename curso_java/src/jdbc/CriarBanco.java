/**
 * 
 */
package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jaime Des
 * Criado em : 6 de abr de 2020
 * exercicios
 */
public class CriarBanco {

	public static void main(String[] args) throws SQLException, IOException {
		
		Connection conn = FabricaConexao.getConn();
		
		
		Statement stmt = conn.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS CURSO_JAVA_2");
		//stmt.execute("DROP DATABASE IF EXISTS CURSO_JAVA_2");
		
		System.out.println("AÇAO EXECUTADA COM SUCESSO!!!");
		conn.close();
	}
}
