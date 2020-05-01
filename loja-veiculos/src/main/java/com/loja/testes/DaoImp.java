package com.loja.testes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/** Projeto: loja-veiculos
 *  Classe: DaoImp.java
 *  Criado em : 1 de mai de 2020
 *  @author jaime Des */

public class DaoImp<E> implements Dao {
	
	private static EntityManager em;
	private static EntityManagerFactory emf;
	private Class<E> classe;
	
	static {

		emf = Persistence.createEntityManagerFactory("loja-veiculos");
	}
	/*
	*  Construct Void
	*/
	public DaoImp() {this(null);}
	/*
	*  Construct Fields
	*/
	public DaoImp(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	@Override
	public void create(Object entidade) {
		
		em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();
		
	}

	@Override
	public List getAll() {
		TypedQuery<E> query = em.createQuery
				("select e from " + classe.getName()+" e", classe);
		return query.getResultList();
	}

	@Override
	public Object getById(Long id) {
		Object obj = em.find(classe, id);
		return obj;
	}

	@Override
	public List findByName(String onome) {
		
		TypedQuery<E> query = em.createQuery
				("select e from " + classe.getName()+ " e "
						+ "where nome like :nome", classe);
		query.setParameter("nome", onome+"%");
		return query.getResultList();
	}

	@Override
	public Object update(Object entidade) {
		
		em.getTransaction().begin();
		em.merge(entidade);
		em.getTransaction().commit();
		
		return entidade;
	}

	@Override
	public void delete(Long id) {
		//FindById
		E entidade = em.find(classe, id);
		//Remove
		em.getTransaction().begin();
		em.remove(entidade);
		em.getTransaction().commit();
		
	}

}
