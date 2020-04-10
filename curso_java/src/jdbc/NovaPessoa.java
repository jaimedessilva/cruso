/**
 * 
 */
package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author jaime Des Criado em : 6 de abr de 2020 exercicios
 */
public class NovaPessoa {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws SQLException, IOException {

		Scanner sc = new Scanner(System.in);
		//Dados do Console
		System.out.println("Informe o nome:");
		String nome = sc.next();
		System.out.println("Informe o ID:");
		int id = sc.nextInt();
		
		System.out.println(id);
		//System.out.println(nome);

		// Conexao
		Connection conn = new FabricaConexao().getConn();
		
		//Inserção no BD
		try {

			String sql = "INSERT INTO PESSOAS (codigo, nome) VALUES (?,?)";
			String sqld = "DELETE FROM PESSOAS WHERE CODIGO = ?";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			//PreparedStatement pst = conn.prepareStatement(sqld);
			
			pst.setInt(1, id);
			pst.setString(2, nome);
			pst.execute();
			
			System.out.println("Ação executada com sucesso!!!");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Ação não executada");
		}
		sc.close();
	}

}
