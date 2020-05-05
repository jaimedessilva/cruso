package com.jpa.dao;

import java.util.List;

/** Projeto: concessionaria
 *  Interface: Dao.java - Met CRUD
 *  Criado em : 4 de mai de 2020
 *  @author jaime Des */

public interface Dao<E> {
	/*
	 * Create
	 */
	public void create (E entidade) ;
	/*
	 *  Read
	 */
	public List<E> getAll();
	
	public List<E> getByName(String nome);
	
	public E getById(long id);
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
