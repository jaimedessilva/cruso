/**
 * 
 */
package teste.basico;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

/**
 * @author jaime Des Criado em : 8 de abr de 2020 curso_jpa
 */
public class CriaUsuario {

	public static void main(String[] args) {

		// Persistence --> Classe que implementa a interface EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso_jpa");
		// Fabrica de Conexão
		EntityManager em = emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		Usuario u = new Usuario();

		System.out.println("Digite um nome:");

			u.setNome(sc.next());

			System.out.println("Digite um email:");

			u.setEmail(sc.next());

		sc.close();
		
		System.out.println(u);
		//Inicia Transação
			em.getTransaction().begin();
		//Persiste Objeto no DB
			em.persist(u);
		//Commita alteração
			em.getTransaction().commit();
			
		//Finaliza Conexao
		em.close();
		emf.close();
	}
}
