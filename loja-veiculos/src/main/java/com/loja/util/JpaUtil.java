package com.loja.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/** Projeto: loja-veiculos
 *  Classe: JpaUtil.java
 *  Criado em : 14 de abr de 2020
 *  @author jaime Des */

public class JpaUtil {
	/*  EntityManagerFactory factory --> Abre a Conexão
	 *  Instancia única p toda a aplicação
	 *  Pode ser acessada por qualquer cod do programa 
	 */
	private static EntityManagerFactory factory;
	
		static {
			factory = Persistence
					.createEntityManagerFactory("App_pedidos_jpa");
		}
		public static EntityManager getFactory () {
			return factory.createEntityManager();
		}
		public static void close() {
			factory.close();
		}
	

}
