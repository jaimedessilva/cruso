/**
 * 
 */
package executa;

import java.sql.SQLException;
import java.util.Scanner;

import dao.Dao;
import model.Usuario;

/**
 * @author jaime Des
 * Criado em : 7 de abr de 2020
 * exercicios
 */
public class Main {
	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		
		//Usuario u = new Usuario();
		Dao dao = new Dao();
		
//		Usuario u0 = new Usuario (100, null, null, null);
//		Usuario u1 = new Usuario("Jaime","jaime@gmail.com","61-9999-7777");
//		Usuario u2 = new Usuario("Joaquin","joaquin@gmail.com","61-9999-8877");
//		Usuario u3 = new Usuario("Maria","maria@gmail.com","61-9988-5577");
//		Usuario u4 = new Usuario("Leandro","leo@gmail.com","61-8888-7777");
//		Usuario u5 = new Usuario(500,"Josias Theofilo","jt@gmail.com","88-7777-7777");
//		Usuario u6 = new Usuario(100,"Tereza","tereza@gmail.com","61-8888-7777");
//		Usuario u7 = new Usuario("Antonia","antonia@gmail.com","61-5522-7777");
//		Usuario u8 = new Usuario(501,"Maria","maria@gmail.com","89-1111-1111");
		
		Scanner sc = new Scanner(System.in);
		   Usuario u9 = new Usuario();
				System.out.println("Digite o Nome p Cadastrar:");
//				System.out.println("Codigo: \n");
//				    u9.id = sc.nextLong();
				System.out.println("Nome: \n");
					u9.nome = sc.next();
				System.out.println("Email: \n");
					u9.email = sc.next();
				System.out.println("Telefone: \n");
					u9.telefone = sc.next();
		sc.close();	
		
		//dao.inserir(u9);

		System.out.println("----------------------------");
		dao.getLista();
		System.out.println("----------------------------");
		

//		 dao.deletar(new Usuario (501, null, null, null));
//		 dao.deletar(new Usuario (502, null, null, null));
//		 dao.deletar(new Usuario (503, null, null, null));
		//dao.alterar(u8);
		//dao.alterar(u4);
		//dao.deletar(100);
	}
}
