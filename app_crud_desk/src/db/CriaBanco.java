/**
 * 
 */
package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jaime Des Criado em : 7 de abr de 2020 exercicios
 */
public class CriaBanco {
	// Conexao
	Connection conn = ConnectionFactory.getConn();

	// Metodo Main
	public static void main(String[] args) throws SQLException {
		CriaBanco create = new CriaBanco();
		
		//create.CriarBanco();
		//create.criarTabela();
		//create.TruncarTabela();
		//create.DroparTabela();
	}
	// Metodo Create Database
	public void CriarBanco() throws SQLException {
		
		String sql = "CREATE DATABASE IF NOT EXISTS DB_CRUD";

		// Script Statement
		Statement st = conn.createStatement();
		st.execute(sql);
		System.out.println("Ação Executada com sucesso");
		System.out.println("Esquema Criado");
		conn.close();
	}

	// Metodo Create Table
	public void criarTabela() throws SQLException {

		
			String sql1 = "CREATE TABLE IF NOT EXISTS DB_CRUD.USUARIOS (\n" + "ID INT AUTO_INCREMENT PRIMARY KEY,\n"
					+ "NOME VARCHAR(100)NULL,\n" + "EMAIL VARCHAR(155)NULL,\n" + "TELEFONE VARCHAR(15)NULL)";
			// Script Statement
			Statement st = conn.createStatement();
			st.execute(sql1);
			System.out.println("Ação executada com sucesso!!!");
			System.out.println("Tabela Criada");
			conn.close();
	}

	// Metodo Truncate Table
	public void TruncarTabela() throws SQLException {
		String sql = "TRUNCATE TABLE DB_JAVA.USUARIOS";
		
		// Script Statement
		Statement st = conn.createStatement();
		st.execute(sql);
		System.out.println("Ação executada com sucesso!!!");
		System.out.println("Tabela Truncada");
		conn.close();
	}
	//Metodo Drop Table
	public void DroparTabela() throws SQLException {
		String sql = "DROP TABLE DB_JAVA.USUARIOS";
		
		// Script Statement
		Statement st = conn.createStatement();
		st.execute(sql);
		System.out.println("Ação executada com sucesso!!!");
		System.out.println("Tabela Dropada");
		conn.close();
	}
}
