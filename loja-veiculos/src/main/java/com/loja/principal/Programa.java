package com.loja.principal;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.loja.dominio.Proprietario;
import com.loja.dominio.TipoCombustivel;
import com.loja.dominio.Veiculo;
import com.loja.dominio.VeiculoId;
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
		Proprietario p1 = new Proprietario(null, "Joao das Couves", "34-1234-5678", "joao@email.com");
		Proprietario p2 = new Proprietario(null, "Carlos Maia", "34-3333-5678", "carlos@email.com");
		Proprietario p3 = new Proprietario(null, "Xororo", "89-123-1111", "caiodias@gmail.com");
		Proprietario p4 = new Proprietario(null, "Caio Dias", "88-555-5555", null);
		/*
		 * Veículos
		 */
		VeiculoId vi1 = new VeiculoId("AAA-1111", "Uberlandia");
		Veiculo v1 = new Veiculo(vi1, "Fiat", "Toro", 2020, 2020, 107000.00, TipoCombustivel.DIESEL, null, p1);
		VeiculoId vi2 = new VeiculoId("ABC-1111", "Goiania");
		Veiculo v2 = new Veiculo(vi2, "Ford", "Fiesta", 2019, 2019, 42000.00, TipoCombustivel.GASOLINA, null, p2);
		VeiculoId vi3 = new VeiculoId("ABC-1200", "São Bernardo");
		Veiculo v3 = new Veiculo(vi3, "VW", "Gol", 2019, 2020, 35000.00, TipoCombustivel.BICOMBUSTIVEL, null, p3);
		VeiculoId vi4 = new VeiculoId("ABC-1234", "Uberlandia");
		Veiculo v4 = new Veiculo(vi4, "Honda", "Civic", 2020, 2020, 71300.00, TipoCombustivel.BICOMBUSTIVEL, null, p4);

		// Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha uma das opções:");
		/*
		 * Menu de Opções
		 */
		System.out.println("\n 0 - Abrir Conexao " + "\n 1 - Cadastrar " + "\n 2 - Atualizar " + "\n 3 - Listar "
				+ "\n 4 - Buscar " + "\n 5 - Sair " + "\n 6 - Cadastrar Um" + "\n 7 - Remover" + "\n 8 - Pesquisar Nome"
				+ "\n 9 - Teste" + "\n 10 - Buscar Prorprietário");
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
			 * Cadatrar um Veículo
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

			em = JpaUtil.getFactory();

			em.getTransaction().begin();

			v = new Veiculo(null, "Ferrari", "Ferrari 360sp", 2015, 2016, 556.899, null, null, null); // Instancia um
																										// Veiculo

			em.persist(v); // Persiste o Veiculo
			em.getTransaction().commit(); // Commit
			em.close(); // Fecha Manager
			JpaUtil.close(); // Fecha Factory

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
			VeiculoId id = new VeiculoId("ABC-1345", "Goianesia");

			vv.setId(id);
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

			scan.close();

			JpaUtil.close();
			em.close();

		}
		sc.close();// sc
	}// Main

}// Class
