/**
 * 
 */
package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jaime Des
 * Criado em : 6 de abr de 2020
 * exercicios
 */
public class ConsultarPessoa2 {

	public static void main(String[] args) throws SQLException, IOException {
		
		Connection conn = FabricaConexao.getConn();
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Digite o nome que procura: ");
//		String nome = sc.next();
//		sc.close();
		
		String sql = "select * from PESSOAS";
		PreparedStatement st = conn.prepareStatement(sql);
		st.executeQuery(sql);
		
		
		List<Pessoa> lst = new ArrayList<Pessoa>();
		
//		int i = 0;	
//		while (lst.) {
//				System.out.println(lst.get(i).getNome());
//				i++;
//			}
//		st.close();
//		conn.close();
		
		}
	}

