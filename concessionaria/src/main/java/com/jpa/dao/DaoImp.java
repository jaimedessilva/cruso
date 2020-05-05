package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jpa.dominio.Veiculo;

/**Projeto: concessionaria 
 * Classe: DaoImp.java 
 * Criado em : 4 de mai de 2020
 * @author jaime Des  ***/

public class DaoImp<E> implements Dao<E> {

	private static EntityManager em;;
	private static EntityManagerFactory emf;
	private Class<E> classe;

	static {
		emf = Persistence.createEntityManagerFactory("concessionaria");
	}
	/*
	 * Construct
	 */
	public DaoImp() {this(null);}

	/*
	 * Construct
	 */
	public DaoImp(Class<E> classe) {
		this.classe = classe;
		// Inicializa com a Classe
		em = emf.createEntityManager();
	}

	/*
	 * Create
	 */
	@Override
	public void create(E entidade) {

		em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();

	}

	/*
	 * Read
	 */
	@Override
	public List<E> getAll() {
		/*
		 * Consulta com paginação
		 */
		TypedQuery<E> query = em.createQuery
				("select e from " + classe.getName() + " e", classe);
		query.setFirstResult(0); // Primeiro Registro
		query.setMaxResults(10); // Nº de Registros
		return query.getResultList();
	}

	/*
	 * Read Get By Name
	 */
	@Override
	public List<E> getByName(String snome) {

		TypedQuery query = em.createQuery
				("select e from " + classe.getName() + " e " 
							+ "where nome like :nome",classe);
		query.setParameter("nome", snome + "%");

		if (query.getResultList() == null) {
			System.out.println("Registro Inexistente");
		}
		return query.getResultList();
	}

	/*
	 * Read Get by ID
	 */
	@Override
	public E getById(long id) {
		
		return em.find(classe, id);
	}

	/*
	 * Update
	 */
	@Override
	public E update(E entidade) {

		em.getTransaction().begin();
		em.merge(entidade);
		em.getTransaction().commit();

		return entidade;
	}

	/*
	 * Delete
	 */
	@Override
	public void delete(Long id) {
		// FindById
		E entidade = em.find(classe, id);
		em.getTransaction().begin();
		em.remove(entidade);
		em.getTransaction().commit();
	}

	/*
	 * Close
	 */
	@Override
	public void closeT() {
		em.close();
		emf.close();

	}

}
