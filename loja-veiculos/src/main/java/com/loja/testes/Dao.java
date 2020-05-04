package com.loja.testes;

import java.util.List;

/** Projeto: loja-veiculos
 *  Classe: InterfaceDao.java
 *  Criado em : 1 de mai de 2020
 *  @author jaime Des */

/*
 *  Interface Dao Generica
 */
public interface Dao<E> {
	/*
	 *  Create
	 */
	public void create(E entidade);
	/*
	 *  Read
	 */
	public List<E> getAll();
	
	public E getById(Long id);
	
	public List<E> findByName(String nome);
	/*
	 *  Update
	 */
	public E update(E entidade);
	/*
	 *  Delete
	 */
	public void delete(Long id);
	/*
	 *  Close
	 */
	public void closeT ();
	
}
