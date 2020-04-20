package db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/** Projeto: App_pedidos_jpa
 *  Classe: ConnectionFactory.java
 *  Criado em : 11 de abr de 2020
 *  @author jaime Des */


public class ConnectionFactory {
	 
	
	private static EntityManagerFactory emf = Persistence
			 .createEntityManagerFactory("App_pedidos_jpa");
	
	//Methods
	public static EntityManager getConn () {
		 return emf.createEntityManager();
	 }
}
