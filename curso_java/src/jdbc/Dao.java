/**
 * 
 */
package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author jaime Des 
 * Criado em : 6 de abr de 2020 exercicios
 */
public class Dao {
	private Connection conn;
	
//	public void incluir(String sql, Object...atributes) {
//		try {
//			PreparedStatement stmt = getConn().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)
//					
//		}catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}
	
	@SuppressWarnings("unused")
	private Connection getConn() throws IOException {
		try {
			if (conn != null && !conn.isClosed()) {
				return conn;
			}
		} catch (SQLException e) {

		}
		conn = FabricaConexao.getConn();
		return conn;
	}
}
