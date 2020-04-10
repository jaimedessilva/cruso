/** */
package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

/** curso_jpa
 *  RemoverUsuario.java
 *  Criado em : 9 de abr de 2020
 *  @author jaime Des */

public class RemoverUsuario {

	public static void main(String[] args) {
			//Conexao com o DB
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("curso_jpa");
			EntityManager em = emf.createEntityManager();
			
			Usuario u = em.find(Usuario.class, 7L);
			
			if (u != null) {
				em.getTransaction().begin();
				em.remove(u);
				em.getTransaction().commit();
			}else {
				System.out.println("Usuario não existe no BD");
			}
			em.close();
			emf.close();

	}

}
