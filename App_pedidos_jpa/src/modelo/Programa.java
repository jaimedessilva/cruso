package modelo;

import java.util.Scanner;
import javax.persistence.EntityManager;
import dao.PersistenceDao;
import db.ConnectionFactory;

/**
 * Projeto: App_pedidos_jpa Classe: TesteT.java Criado em : 11 de abr de 2020
 * 
 * @author jaime Des
 */
/*
 * Classe que executa a aplicação App_pedidos_jpa
 */
public class Programa {

	public static <E> void main(String[] args) {
		/*
		 * Pessoa
		 */
		Pessoa p1 = new Pessoa(null, "Morais Moreira", "morais@email.com", "89-8888-1111");
		Pessoa p2 = new Pessoa(null, "Caio Silva", "caiosilva@email.com", "89-8888-5552");
		Pessoa p3 = new Pessoa(null, "Maria Flores", "mariaflores@email.com", "89-8888-6666");
		Pessoa p4 = new Pessoa(null, "Sylvester Sttalone", "sly@email.com", "89-8888-7777");
		Pessoa p5 = new Pessoa(null, "Andressa Uraq", "andrezza@email.com", "89-8888-6632");
		Pessoa p6 = new Pessoa(null, "Marta Morais", "marta@email.com", "89-5555-6632");
		Pessoa p7 = new Pessoa(null, "Anreia Balls", "andreia@email.com", "89-5566-6632");
		Pessoa p8 = new Pessoa(null, "Juliana Schumit", "juschimit@email.com", "89-3311-6632");
		Pessoa p9 = new Pessoa(null, "Harley Queen", "harley123@email.com", "89-7777-6632");
		Pessoa p10 = new Pessoa(null, "Teodoro Santos", "teodoro@email.com", "89-5555-7777");
		Pessoa p11 = new Pessoa(null, "Jhon Rambo Logan", "rambo@email.com", "89-7788-6632");
		/*
		 * ItemProduto
		 */
		ItemProduto prod1 = new ItemProduto(null,"Notebook","Notebook Asus Cor I5 8gb", 2299.99);
		ItemProduto prod2 = new ItemProduto(null,"TV 4k","TV Samsing 4k ultra HD", 3399.99);
		ItemProduto prod3 = new ItemProduto(null,"Geladeira","Geladeira Eletrolux 380l", 1299.99);
		/*
		 * Daos
		 */
		PersistenceDao<Pessoa> d1 = null;    //Pessoa
		PersistenceDao<Pedido> d2 = null;     //Pedido
		PersistenceDao<ItemProduto> d3 = null; //Item
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha uma das opções:");
		System.out.println("\n 1 - Cadastrar \n 2 - Atualizar \n 3 - Listar \n 4 - Buscar \n 0 - Sair");
		int opcao = sc.nextInt();

		sc.close();

		switch (opcao) {

		case 1: // Cadastrar
			// DAO
			d1 = new PersistenceDao<Pessoa>(Pessoa.class);
			/*
			 * Array com todos os Objetos
			 */
			Object obj[] = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11 };
			// Dao
			d1 = new PersistenceDao<Pessoa>(Pessoa.class);
			/*
			 * Inserir Vários Dados atravéz de um Array Object
			 */
			for (int i = 0; i < obj.length; i++) {

				d1.salvar((Pessoa) obj[i]);

				System.out.println("Salvo!!!");
			}
			System.out.println("Dados Salvos com sucesso!!!");
			// Fecha Transação
			d1.fecharT();
			break;
		
		case 2: // Atualizar
			
			d1 = new PersistenceDao<Pessoa>(Pessoa.class);
			d1.atualizar(p1);
			System.out.println("Dados Salvos com sucesso!!!");
			break;
		
		case 3: // Listar
			// DAO
			d1 = new PersistenceDao<Pessoa>(Pessoa.class);
			d1.listar();
			System.out.println(d1.listar());
			break;
		
		case 4: // Buscar por ID
			// DAO
			d1 = new PersistenceDao<Pessoa>(Pessoa.class);
			/*
			 * Buscar no Banco de Dados
			 */
			try {
				p1 = d1.buscar(2L);
				System.out.println(p1);
				System.out.println("---------------------------------------");

			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 0:
			d3 = new PersistenceDao<>(ItemProduto.class);
			
			d3.salvar(prod1);
			d3.salvar(prod3);
			d3.salvar(prod3);
			d3.fecharT();
	
			break;
		
		default:
			System.out.println("Digite numero entre 0 a 4");
			
		}
	}
}
