package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

/**
 * @author jaime Des
 * Criado em : 8 de abr de 2020
 * curso_jpa
 */
public class ObterUsuario {

	public static void main(String[] args) {
		//Conexão
		//Implementa a Interface EMF na Classe Persistence
		//Informa onde estão as credenciais para acesso ao banco
		EntityManagerFactory emfactory = Persistence.
				createEntityManagerFactory("curso_jpa");
		//Implementa EM em emFactory
		EntityManager em = emfactory.createEntityManager();
		
		//Select usuario na Tabela
		//Metodo Find
		Usuario u = em.find(Usuario.class, 3L);
		System.out.println(u);
		
		//Encerra Transação
		em.close();
		emfactory.close();

	}
}
