/**
 * 
 */
package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

/** @author jaime 
 *  Des Criado em : 8 de abr de 2020 
 *  curso_jpa */

public class AlteraUsuario1 {

	public static void main(String[] args) {
		// Conexao com o Banco
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("curso_jpa");
		EntityManager em = factory.createEntityManager();

		//Inicia a transação
		em.getTransaction().begin();
		//Pega o Objeto vindo do Banco
		Usuario usuario = em.find(Usuario.class, 4L);
		//Cria um Objeto p Sincronia no DB
		usuario.setNome("Caio Castro");
		usuario.setEmail("caiocastro@gmail.com");
		//Torna o Objeto ñ gerenciado
		em.detach(usuario);
		//Altera o usuario somente se for invocado
		//Gera Update somente se for alterado
		em.merge(usuario);

		System.out.println(usuario);

		em.getTransaction().commit();
		
		
		

		em.close(); 
		factory.close();

	}

}
