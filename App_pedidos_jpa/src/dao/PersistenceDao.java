package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

import modelo.Pessoa;

/**
 * Projeto: App_pedidos_jpa 
 * Classe: DaoGenerico.java 
 * Criado em : 11 de abr de 2020
 * @author jaime Des
 * @param <I>  **/

/*
 * Classe Dao Generica que faz todas as operações de banco de dados Podendo
 * receber com parametros Entidades Classes ou variáveis
 */
public class PersistenceDao<E> {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("App_pedidos_jpa");
	private static EntityManager em = null;
	List<E> lst;
	Class<E> classe;

	/*
	 * Construct
	 */
	public PersistenceDao() {
		this(null);
		em = emf.createEntityManager();
	}

	/*
	 * Construct
	 */
	public PersistenceDao(Class<E> classe) {
		super();
		this.classe = classe;
		em = emf.createEntityManager();
	}
	/*
	 *  Listar Dados
	 */
	public List<E> listar(){
		if (classe == null) {
			System.out.println("Dados incompletos");
		}
			String jpql = "select e from " + classe.getName() + " e";
			TypedQuery<E> query = em.createQuery(jpql, classe);
		    return query.getResultList();
	    }
	/*
	 * Find by ID
	 */
	public E buscar(Object id) {

		return em.find(classe, id);
	}
	/*
	 * Save
	 */
	public E salvar(E entidade) {
		em.getTransaction().begin();
		if (entidade != null) {
			em.persist(entidade); // Persiste
			em.getTransaction().commit(); // Efetiva a transação
		} else {
			System.out.println("Valor Vázio"); // Retorna Caso Objeto esteja vazio
		}

		return entidade; // Retorna Entidade
	}

	/*
	 * Update
	 */
	public E atualizar(E entidade) {
		em.getTransaction().begin();
		if (entidade != null) {
			em.merge(entidade);
		}else {
			System.out.println("Não foi possivel realizar a operação");
		}
		return entidade;
	}
	/*
	 * Delete
	 */
	public void remover(E id) {
		

	}

	public void fecharT() {
		em.close();
	}
}


	