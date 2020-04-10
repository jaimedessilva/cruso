/**
 * 
 */
package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

/**
 * @author jaime Des 
 * Criado em : 8 de abr de 2020 
 * curso_jpa */

public class ListaUsuarios {

	public static void main(String[] args) {
		// Conexao com o DB
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("curso_jpa");
		EntityManager em = factory.createEntityManager();

		// Select na Tabela
		// String em JPQL --> JPA
		String jpql = "select u from Usuario u";
		// Resultado de Busca
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		// Limite nº de resultado na Busca
		query.setMaxResults(10).getResultList();
		// Insere o Resultado da Query em uma Lista
		List<Usuario> us = query.getResultList();
		// Laço para buscar usuarios
		for (Usuario u : us) {
			System.out.println(u);
		}
	}
}
