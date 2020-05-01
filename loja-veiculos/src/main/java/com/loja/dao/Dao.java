package com.loja.dao;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import com.loja.dominio.Proprietario;
import com.loja.dominio.TipoCombustivel;
import com.loja.dominio.Veiculo;
import com.loja.dominio.VeiculoPlaca;

/** Projeto: loja-veiculos
 *  Classe: Dao.java
 *  Criado em : 28 de abr de 2020
 *  @author jaime Des */

/*
 *  Classe Dao Generica
 */
public class Dao<E> {
	 
	private static EntityManager em;
	private static EntityManagerFactory emf;
	private Class<E> classe;
	
	static {
		/*
		 *  Static EntityManagerFactory
		 */
		try {
			emf = Persistence.createEntityManagerFactory("loja-veiculos");	
		}catch(Exception e) {
			//Log4j
		}	
	}
	/*
	*  Construct
	*/
	public Dao() {
		this(null);
	}
	/*
	*  Construct
	*/
	public Dao(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	/*
	 *  Inserir Void sem retorno
	 */
	public void inserir (E entidade) {
		
			em.getTransaction().begin();
			em.persist(entidade);
			em.getTransaction().commit();
			em.close();
			emf.close();
	}
	/*
	 *  Inserir Entidade
	 */
	public E add (E entidade) {
			em.getTransaction().begin();
			em.persist(entidade);
			em.getTransaction().commit();
			em.close();
			emf.close();
		
		return entidade; // Retorna Entidade	
	}
	/*
	 *  Atualizar dados
	 */
	public E atualizar (E entidade) {
		
		em.getTransaction().begin();
		em.merge(entidade);
		em.getTransaction().commit();
		
		return entidade;
	}
	/*
	 *  Remover Entidade
	 */
	public void remover(Long id) {
		//Find Entidade By Id
		E entidade = em.find(classe, id);
		if (entidade != null) {
			//Confirmação
			System.out.println("Deseja realmente remover esse Registro???");
			System.out.println(entidade.toString());
			Scanner sc = new Scanner(System.in);
				System.out.println("\n 1 - Deletar 2 - Não Deletar");
				int op = sc.nextInt();
				if (op == 1) {
					//Remove
					em.getTransaction().begin();
					em.remove(entidade);
					em.getTransaction().commit();
					emf.close();
				}else if (op == 2) {
					System.out.println("Sair");
				}
				sc.close();

		}else {
			System.out.println("Usuario inexistente");
		}
	}
	/*
	 *  Listar com Paginação
	 */
	public List<E> listar(){
		
		TypedQuery<E> query = em.createQuery
				("select e from " + classe.getName()+" e", classe);
		query.setFirstResult(0);
		query.setMaxResults(10);    
		List<E> lst = query.getResultList();
		
		return lst;
	}
	/*
	 *  Find By Name --> JPQL
	 */
	public List<E> findByName(String outname){
		/*
		 *  JPQL traz o nome pela clausula Like
		 */
		Query query = em.createQuery
				("select e from "+ classe.getName()+" e" 
						+ " where nome like :nome");
		query.setParameter("nome", outname +"%");		
		List<E> lst = query.getResultList();
		return lst;
	}
	/*
	 *  Buscar por ID --> JPQL
	 */
	public List<E> buscar(long id){
		
		Query query = em.createQuery
				("select v from "+ classe.getName() +"v where id = :id");
		query.setParameter("id", id);
		List<E> lst = query.getResultList();
		return lst;
	}
	/*
	 *  Buscar por ID
	 */
	public E findById(long id) {
		
		return em.find(classe, id);
	}
}//Class Dao
