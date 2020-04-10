/**
 * 
 */
package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jaime Des Criado em : 6 de abr de 2020 exercicios
 */
public class CriarTabelaPessoa {
	/**
	 * @param args
	 * @throws SQLException
	 * @throws IOException 
	 */
	public static void main(String[] args) throws SQLException, IOException {
		Connection conn = FabricaConexao.getConn();
		
		String sql = "CREATE TABLE IF NOT EXISTS PESSOAS (" + "CODIGO INT AUTO_INCREMENT PRIMARY KEY,"
				+ "NOME VARCHAR(80) NOT NULL" + ")";

		Statement st = conn.createStatement();
		st.execute(sql);
		System.out.println("Ação executada com sucesso!!!");
		conn.close();

	}

}
