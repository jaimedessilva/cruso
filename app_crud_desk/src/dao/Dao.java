/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import db.ConnectionFactory;
import model.Usuario;

/**
 * @author jaime Des Criado em : 7 de abr de 2020 exercicios
 */
public class Dao {
	// Attributes
	Usuario u = new Usuario();
	Connection conn = ConnectionFactory.getConn();
	List<Usuario> usuarios;

	// Methods
	
	//Listar
	public void getLista() throws SQLException {
		// instancia o Objeto
		usuarios = new ArrayList<Usuario>();
		String sql = "SELECT * FROM USUARIOS";
		PreparedStatement pst = conn.prepareStatement(sql);

		// Execute Select
		ResultSet rs = pst.executeQuery();
		// Iteração
		while (rs.next()) {
			u.id = rs.getLong("id");
			u.nome = rs.getString("nome");
			u.email = rs.getString("email");
			u.telefone = rs.getString("telefone");
			System.out.println(u.toString());
		}
		rs.close();
		conn.close();
	}
	// Inserir
	public void inserir(Usuario u) throws SQLException {

		String sql = "INSERT INTO USUARIOS (NOME, EMAIL, TELEFONE) " 
		+ "values (?,?,?)";
		// Prepare p insert
		PreparedStatement pst = conn.prepareStatement(sql);
		// Seta Valores
		pst.setString(1, u.nome);
		pst.setString(2, u.email);
		pst.setString(3, u.telefone);
		// Executa
		pst.execute();
		pst.close();
		System.out.println("Usuario Inserido com Secesso!!!!");
		System.out.println(u.toString());
		System.out.println("---------------------------------");
	}

	// Insert com ID
	public void inserirId(Usuario u) throws SQLException {
		
		String sql = "INSERT INTO USUARIOS (ID,NOME, EMAIL, TELEFONE) " + "values (?,?,?,?)";
		// Prepare p insert
		PreparedStatement pst = conn.prepareStatement(sql);
		// Seta Valores
		pst.setLong(1, u.id);
		pst.setString(2, u.nome);
		pst.setString(3, u.email);
		pst.setString(4, u.telefone);

		// Executa
		pst.execute();
		pst.close();
		
		System.out.println("Usuario Inserido com Secesso!!!!");
		System.out.println(u.toString());
		System.out.println("---------------------------------");
	}
	//Alterar
	public void alterar(Usuario u) throws SQLException {
		String sql = "UPDATE USUARIOS SET NOME=?, EMAIL=?, TELEFONE=?"
				+ "WHERE ID = ?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, u.nome);
		pst.setString(2, u.email);
		pst.setString(3, u.telefone);
		pst.setLong(4, u.id);
		pst.execute();
		pst.close();
		
		System.out.println("Usuario Alterado com Secesso!!!!");
		System.out.println(u.toString());
		System.out.println("---------------------------------");
	}
	//Deletar
	public void deletar(Usuario u) throws SQLException {
		String sql = "DELETE FROM USUARIOS WHERE ID = ?";
		
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setLong(1, u.id);
		pst.execute();
		pst.close();
		System.out.println("Usuario de ID:" + u.id + " Excluido !!!");
		System.out.println("---------------------------------");

	}
}
