package com.loja.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.loja.dominio.Acessorio;
import com.loja.dominio.Proprietario;
import com.loja.dominio.TipoCombustivel;
import com.loja.dominio.Veiculo;
import com.loja.dominio.VeiculoPlaca;
import com.loja.util.JpaUtil;

/** Projeto: loja-veiculos 
 *  Classe: Programa.java 
 *  Criado em : 14 de abr de 2020
 *  @author jaime Des **/

public class Programa {

	public static void main(String[] args) {
		// Carros
		Veiculo v = null;
		/*
		 * Proprietários
		 */
		Proprietario p1 = new Proprietario(null, "Joao das Couves","joao@email.com","34-1234-5678");
		Proprietario p2 = new Proprietario(null, "Carlos Maia", "carlos@email.com", "34-3333-5678");
		Proprietario p3 = new Proprietario(null, "Xororo", "caiodias@gmail.com", "89-123-1111");
		Proprietario p4 = new Proprietario(null, "Caio Dias", null,"88-555-5555");
		/*
		 *  Acessório
		 */
		Acessorio ac1 = new Acessorio(null,"Roda de Liga Leve",null);
		Acessorio ac2 = new Acessorio(null,"Sensor de Estacionamento",null);
		Acessorio ac3 = new Acessorio(null,"MP3 Player",null);
		Acessorio ac4 = new Acessorio(null,"Pintura Metalizada",null);
			List<Acessorio> lst = new ArrayList<>();
			lst.add(ac1);
			lst.add(ac2);
			lst.add(ac3);
			lst.add(ac4);
			for (Acessorio acss : lst) {
				//System.out.println(acss);
			}
	
		/*
		 *  Placa
		 */
		VeiculoPlaca pl1 = new VeiculoPlaca("AAA-1111", "Uberlandia");
		VeiculoPlaca pl2 = new VeiculoPlaca("ABC-1111", "Goiania");
		VeiculoPlaca pl3 = new VeiculoPlaca("ABC-1200", "São Bernardo");
		VeiculoPlaca pl4 = new VeiculoPlaca("ABC-1234", "Uberlandia");
		
		/*
		 * Veículos
		 */
		
		Veiculo v1 = new Veiculo(null, pl1, "Fiat", "Toro", 2020, 2020, 107000.00, TipoCombustivel.DIESEL, null, p1,null);	
		Veiculo v2 = new Veiculo(null, pl2, "Ford", "Fiesta", 2019, 2019, 42000.00, TipoCombustivel.GASOLINA, null, p2, null);
		Veiculo v3 = new Veiculo(null, pl3, "VW", "Gol", 2019, 2020, 35000.00, TipoCombustivel.BICOMBUSTIVEL, null, p3, null);
		Veiculo v4 = new Veiculo(null, pl4, "Honda", "Civic", 2020, 2020, 71300.00, TipoCombustivel.BICOMBUSTIVEL, null, p4, null);
		// Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha uma das opções:");
		/*
		 * Menu de Opções
		 */
		System.out.println("\n 0 - Abrir Conexao " + "\n 1 - Cadastrar " + "\n 2 - Atualizar " 
				+ "\n 3 - Listar "
				+ "\n 4 - Buscar " + "\n 5 - Sair " + "\n 6 - Cadastrar Um" + "\n 7 - Remover" 
				+ "\n 8 - Pesquisar Nome"
				+ "\n 9 - Teste" 
				+ "\n 10 - Buscar Prorprietário");
		int opcao = sc.nextInt();

		// EntityManager --> Abre Conexão ...
		EntityManager em;

		if (opcao == 0) {
			/*
			 * Abre o EntityManager e Gera as Tabelas
			 */
			em = JpaUtil.getFactory();

		} else if (opcao == 1) {

			/*
			 * Cadastrar um Veículo
			 */

			System.out.println("Cadastrar");

			em = JpaUtil.getFactory(); // Instancia o EntityManagerFactory

			Veiculo carros[] = { v1, v2, v3, v4 }; // Armazena Objetos em um array
			Proprietario p[] = { p1, p2, p3, p4 }; // Armazena Proprietarios
			// Inicia transação
			em.getTransaction().begin();

			for (int i = 0; i < carros.length; i++) {
				// Armazena todos os objetos de uma vez Loop For
				em.persist(carros[i]);
				em.persist(p[i]);
			}
			em.getTransaction().commit(); // Commit
			em.close(); // Finaliza
			JpaUtil.close();

		} else if (opcao == 2) {

			/*
			 * Atualizar Registro
			 */

			em = JpaUtil.getFactory();
			System.out.println("Atualizar");
			em.getTransaction().begin();
			v = em.find(Veiculo.class, 1l); // ID
			System.out.println("Valor Atual" + v.getValor());
			v.setValor(89000.00);
			System.out.println("Novo Valo:" + v.getValor());
			em.getTransaction().commit();

			em.close();
			JpaUtil.close();

		} else if (opcao == 3) {
			/*
			 * Listar Veículos
			 */
			em = JpaUtil.getFactory();

			Query query = em.createQuery("select v from Veiculo v"); // Query
			List<Veiculo> ve = query.getResultList(); // Armazena o resultado em uma lista

			for (Veiculo car : ve) {
				System.out.println("----------------------------");
				System.out.println("Veículo");
				System.out.println("----------------------------");
				System.out.println(car.toString());
			}
			em.close();
			JpaUtil.close();

		} else if (opcao == 4) {
			/*
			 * Buscar por ID
			 */
			System.out.println("Buscar Veículo por ID");

			em = JpaUtil.getFactory();

			v = em.find(Veiculo.class, 2l); // Busca
			System.out.println("----------------------------");
			System.out.println("Veículo");
			System.out.println("----------------------------");
			System.out.println("Veículo: " + v.toString());
			em.close();
			JpaUtil.close();

		} else if (opcao == 6) {

			/*
			 * Cadastrar Um veículo
			 */
			System.out.println("Cadastrar Um");
			
			String desc = "Veículo em excelente estado adquirido de um "
					+ "chacke em meados de novembro desse ano";
			try {
				//Proprietario
				Proprietario p0 = new Proprietario(19L,"Reilson Lima","reilson@gmail.com","61-5555-9999");             //Proprietário
				Proprietario p = new Proprietario(20L,"Roberto Jefferson","roberto@gmail.com","61-9999-9999");          //Proprietário
				
				//Id tabela Veículo
				VeiculoPlaca pl0 = new VeiculoPlaca("AAA-777","Brasilia-DF"); //Id
				VeiculoPlaca pl = new VeiculoPlaca("ABE-777","Brasilia-DF");  //Id
				VeiculoPlaca pl11 = new VeiculoPlaca("CCC-777","Brasilia-DF");  //Id
				VeiculoPlaca pl22 = new VeiculoPlaca("XXX-555","Rio de Janeiro");  //Id



				//Veículos
				Veiculo v0 = new Veiculo(null,pl0, "Ferrari", "Ferrari 360sp", 2018, 2019, 756965.89, TipoCombustivel.GASOLINA,desc,p0, null); 
				Veiculo vv = new Veiculo(null,pl, "Lamborguini", "Lamborguini Murcielago", 2016, 2017, 876965.89, TipoCombustivel.GASOLINA,desc,p0, null);
				Veiculo vv1 = new Veiculo(null,pl11, "Lamborguini", "Lamborghini Murciélago", 2017, 2017, 676965.89, TipoCombustivel.GASOLINA,desc,p, null);
				Veiculo vv2 = new Veiculo(null,pl22, "Ford", "Ká", 2017, 2017, 18965.89, TipoCombustivel.BICOMBUSTIVEL,desc,p, null);
				
				
				em = JpaUtil.getFactory();
				em.getTransaction().begin();
				
				//em.persist(p0); //Persiste Proprietario
				//em.persist(v0); // Persiste o Veiculo
				
				//em.persist(p);
				//em.persist(vv);
				em.persist(p0);
				em.persist(p);
				em.persist(v0);
				em.persist(vv);
				em.persist(vv1);
				em.persist(vv2);

				em.getTransaction().commit(); // Commit
				
				em.close(); // Fecha Manager
				JpaUtil.close(); // Fecha Factory
			}catch (Exception e) {
				e.getStackTrace();
			}
	

		} else if (opcao == 7) {

			/*
			 * Excluir um Objeto
			 */

			em = JpaUtil.getFactory();

			em.getTransaction().begin();
			v = em.find(Veiculo.class, 3l);
			em.remove(v);
			em.getTransaction().commit();
			em.close();
			JpaUtil.close();

		} else if (opcao == 8) {

			/*
			 * Buscar Modelo pelo nome Like % modelo %
			 */
			em = JpaUtil.getFactory();
			Scanner ent = new Scanner(System.in);
			System.out.println("Digite o veículo que deseja");
			String modelo = ent.next();

			Query query = em.createQuery("select v from Veiculo v " + "where modelo like '%" + modelo + "%'");
			List<Veiculo> ve = query.getResultList();

			for (Object obj : ve) {
				System.out.println(obj);
			}
			em.close();
			JpaUtil.close();

		} else if (opcao == 9) {

			/*
			 * Inserir Descricao e coluna Enum
			 */
			em = JpaUtil.getFactory();
			em.getTransaction().begin();

			StringBuilder esp = new StringBuilder();
			esp.append("Carro em excelente estado.\n");
			esp.append("Completo, menos ar.\n");
			esp.append("Primeiro dono, com manual de instrução ");
			esp.append("e todas as revisões feitas.\n");
			esp.append("IPVA pago, aceita financiamento.");

			Veiculo vv = new Veiculo();
			VeiculoPlaca id = new VeiculoPlaca("ABC-1345", "Goianesia");

			vv.setId(null);
			vv.setFabricante("VW");
			vv.setModelo("Voyage");
			vv.setAnoFabricacao(2018);
			vv.setAnoModelo(2019);
			vv.setValor(17200.00);
			vv.setTipoComb(TipoCombustivel.BICOMBUSTIVEL);
			vv.setEspecificacao(esp.toString());

			em.persist(vv);
			em.getTransaction().commit();

			em.close();
			JpaUtil.close();

		} else if (opcao == 10) {
			/*
			 * Consultar proprietário
			 */
			Proprietario prop;
			long id;

			em = JpaUtil.getFactory(); // EntityManageFactory

			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o codigo que busca");
			id = scan.nextLong();

			prop = em.find(Proprietario.class, id); // Objeto Prop recebe a Busca

			System.out.println(prop.toString());
			
			for (Veiculo veiculo : prop.getVeiculos()) {
				
				System.out.println("Veículo" + veiculo.getModelo());
			}

			scan.close();

			JpaUtil.close();
			em.close();

		} else if (opcao == 11) {
			
		}
		
		sc.close();// sc
	}// Main

}// Class
