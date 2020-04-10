/**
 * 
 */
package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier;
import com.mysql.cj.xdevapi.Result;

/**
 * @author jaime Des
 * Criado em : 6 de abr de 2020
 * exercicios
 */
public class ConsultarPessoas1 {
	public static void main(String[] args) throws SQLException, IOException {
		
		Connection conn = FabricaConexao.getConn();
		String sql = "select * from PESSOAS WHERE NOME LIKE '%?%'";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome que procura: ");
		String nome = sc.next();
		sc.close();
		
		
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		st.setString(1, nome);
		st.execute();
		
		List<Pessoa> ps = new ArrayList<Pessoa>();
		
		while (rs.next()) {
			int cod = rs.getInt("codigo");
			nome = rs.getString("nome");
			ps.add(new Pessoa (cod, nome));	
		}
			for (Pessoa p: ps) {
				System.out.println(p.getCodigo() +"==>" + p.getNome());
			}
		st.close();
		conn.close();
		
	}
}
