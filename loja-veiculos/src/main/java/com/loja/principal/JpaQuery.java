package com.loja.principal;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.loja.dominio.Proprietario;
import com.loja.dominio.Veiculo;
import com.loja.util.JpaUtil;

/** Projeto: loja-veiculos
 *  Classe: JpqlQuery.java
 *  Criado em : 21 de abr de 2020
 *  @author jaime Des */

/*
 *   Java Persistence Query Language
 */
public class JpaQuery {

	private static Object nome;

	public static void main(String[] args) {
		//EntityManager --> factory
		EntityManager em = JpaUtil.getFactory();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma das opções:");
		System.out.println("\n 1 - Simple Query \n 2 - Paginação \n 3 - TypedQuery "
				+ "\n 4 - Campos \n 5 - Single Line \n 6 - Join \n 7 - Native Query \n 8 - FindbyName Like");
		int op = sc.nextInt();
		
		if (op == 1) {
			/*
			 *   Simple Query
			 */
			Query query = em.createQuery("select v from Veiculo v "
					+ "where anoFabricacao = 2019");
			List veiculos = query.getResultList();
			
			//List
			for (Object obj : veiculos) {
				System.out.println(obj.toString());
			}
				
		}else if (op == 2) {
			/*
			 *  Query Paginação
			 */
			//Typed Query Paginação
			TypedQuery<Veiculo> query = em.createQuery("from Veiculo v",Veiculo.class);
			query.setFirstResult(0);
			query.setMaxResults(3);
			//Lista
			List<Veiculo> veiculos = query.getResultList();
			
			for (Veiculo v : veiculos) {
				 System.out.println(v.getModelo());
			}

		}else if (op == 3) {
			/*
			 *  Query Nomeada
			 */
			Query query = em.createQuery("select v from Veiculo v"
					+ " where anoFabricacao >= :ano and valor <= :preco");
			query.setParameter("ano", 2020);
			query.setParameter("preco", 107000.00);
			List list = query.getResultList();
			 for (Object obj : list) {
				 System.out.println(obj.toString());
			 }
			
		}else if (op == 4) {
			/*
			 *  Campos
			 */
			TypedQuery<String> query = em.createQuery
					("select modelo from Veiculo", String.class);
			List<String> campos = query.getResultList();
			
			for(String campo : campos) {
				System.out.println(campo.toString());
			}
		}else if (op == 5) {
			/*
			 *  Resultado Unico
			 */
			TypedQuery<Long> query = em.createQuery
					("select count(v) from Veiculo v",Long.class);
			Long qtd = query.getSingleResult();
			
			System.out.println("\n Quantidade de veiculos:" + qtd);
			
		} else if (op == 6) {
			/*
			 *  Inner Join
			 */
			TypedQuery<Proprietario> query = em.createQuery
					("select p from Proprietario p inner join p.veiculos v", Proprietario.class);
			List<Proprietario> lst = query.getResultList();
			
			for (Proprietario p : lst) {
				System.out.println(p.toString());
			}
			
			
		}else if (op == 7) {
			/*
			 *  Native Query
			 */
			Query query = em.createNativeQuery
					("select * from t_veiculo v \n" + 
							"inner Join t_proprietario p\n" + 
							"where p.id = v.prop_id", Veiculo.class);
			List<Veiculo> lst = query.getResultList();
			for (Veiculo veiculos : lst) {
				//System.out.println(veiculos.toString());
				System.out.println(veiculos.getFabricante()+"-"+veiculos.getModelo());
				System.out.println(veiculos.getAnoFabricacao()+"\\"+veiculos.getAnoModelo());
				System.out.println(veiculos.getPlaca()+"\n proprietario: " + veiculos.getProp().getNome());
				System.out.println("\n tel:" +veiculos.getProp().getTelefone());
			}
		}else if (op == 8) {
			/*
			 *  Query Like Clause
			 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o nome que deseja buscar");
			String sname = scan.next();
					Query query = em.createQuery
									("select p from Proprietario p where nome like :name");
					query.setParameter("name", sname+ "%");
					
					List<Proprietario> list = query.getResultList();
					
					for (Proprietario p : list) {
						System.out.println(p);
					}
			
					scan.close();
		}
		sc.close();
		em.close();
		JpaUtil.close();

	}

}
