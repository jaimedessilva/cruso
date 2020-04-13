package teste.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/** Projeto: curso_jpa
 *  Classe: SimpleDao.java
 *  Criado em : 12 de abr de 2020
 *  @author jaime Des 
 * @param <E>
 * @param <I>
 * @param <O>*/

public class SimpleDao<E> {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso_jpa");
		EntityManager em = null;
		Class<E>cl;
		
	public SimpleDao() {
		this(null);
	}
	//Construct
	public SimpleDao(Class<E> cl) {
		this.cl = cl;
		em = emf.createEntityManager();
	}
	public void add(E obj) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		em.close();
	}
	public E buscar (Object id) {
		return em.find(cl, id); 
	}
/*
 *   METODO MAIN
 */
	public static void main(String[] args) {
		
		//EPessoa p = new EPessoa(); //Pessoa
		
			EPessoa p;
			SimpleDao<EPessoa> dao;
			
			dao = new SimpleDao(EPessoa.class); //Dao
			
			try {
				p = dao.buscar(4);
				if (p != null) {  
					System.out.println(p.toString());
				}else {
					System.out.println("Usuario inexistente nos registros");
				}
			}catch (Exception e) {
				e.getMessage();
			}
	}

}

