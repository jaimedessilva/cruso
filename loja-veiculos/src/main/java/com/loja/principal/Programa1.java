package com.loja.principal;

import java.util.List;
import java.util.Scanner;
import com.loja.dao.Dao;
import com.loja.dominio.Proprietario;
import com.loja.dominio.TipoCombustivel;
import com.loja.dominio.Veiculo;
import com.loja.dominio.VeiculoPlaca;

/** Projeto: loja-veiculos
 *  Classe: Programa1.java
 *  Criado em : 29 de abr de 2020
 *  @author jaime Des */

public class Programa1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 *  Menu de opções
		 */
		System.out.println("Escolha uma das opções");
		System.out.println("\n 0 - Buscar \n "
				+ "1 - Listar \n "
				+ "2 - Cadastrar Veiculo \n "
				+ "3 - Cadastrar Proprietário \n "
				+ "4 - Atualizar \n "
				+ "5 - Deletar \n "
				+ "6 - Buscar Proprietario");
		try {
			int op = scan.nextInt();

		if (op == 0) {
			/*
			 *  Buscar por ID
			 */
			Scanner sc = new Scanner(System.in);
				System.out.println("Digite o Codigo");
				Long id = sc.nextLong();
				/*
				 *  Buscar por ID
				 */
				try {
					Dao<Veiculo> dv = new Dao<Veiculo>(Veiculo.class);
					
					Veiculo car = dv.findById(id);
					
					System.out.println(car);
	
				}catch (Exception e) {
					System.out.println("Não Deu");
				}

		}else if (op == 1) {
			/*
			 *  listar Veiculos
			 */
			Dao<Veiculo> dao = new Dao<>(Veiculo.class);
			System.out.println("---------------------");
			System.out.println(dao.listar());
			System.out.println("---------------------");
			
		}else if (op == 2) {
			/*
			 *  Cadastrar Veiculo
			 */
			try {
				Scanner sc = new Scanner(System.in);
				/*
				 *  Cria Nova Placa 
				 */
				VeiculoPlaca placa = new VeiculoPlaca("AAA-123","St Catarina");
				/*
				 *  Insere os Dados do veículo
				 */
				System.out.println("Cadastrar Veiculo:");
				System.out.println("Fabricante:");
				String fabricante = sc.nextLine();
				System.out.println("Modelo:");
				String modelo = sc.nextLine();
				System.out.println("Ano Fabricação:");
				int anoFabricacao = sc.nextInt();
				System.out.println("Ano Modelo:");
				int anoModelo = sc.nextInt();
				System.out.println("Valor R$:");
				double valor = sc.nextDouble();
				System.out.println("Digite o código do Proprietario:");
				Long id = sc.nextLong();
				/*
				 *  Recebe o Proprietario pelo ID
				 */
				Dao<Proprietario> dp = new Dao<>(Proprietario.class);
				Proprietario prop = dp.findById(id);
				//Verifica se Proprietario existe na base
				if (prop == null) {
					System.out.println("Proprietario não existe");
				}else {
				/*
				 *  Instancia um Veiculo
				 */
					Veiculo car = new Veiculo();
					
					car.setPlaca(placa);
					car.setFabricante(fabricante);
					car.setModelo(modelo);
					car.setAnoFabricacao(anoFabricacao);
					car.setAnoModelo(anoModelo);
					car.setValor(valor);
					car.setTipoComb(TipoCombustivel.BICOMBUSTIVEL);
					car.setProp(prop);
					/*
					 *  Inserir Novo Veiculo
					 */
					System.out.println("-----------------------------");
					System.out.println(car.toString());
					System.out.println("-----------------------------");
					Dao<Veiculo> dv = new Dao<>(Veiculo.class);
					System.out.println("Inserindo......");
					dv.add(car);
					System.out.println("Dados inseridos com sucesso \n" + car.toString());
				
				}
				sc.close();

			}catch(Exception e) {
				System.out.println("Não foi possivel executar");
			}
				
		}else if (op == 3) {
			/*
			 *  Cadastrar Proprietario
			 */
			try {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Cadastrar novo Proprietario:");
				System.out.println("Digite o nome:");
				String nome = sc.nextLine();
				System.out.println("Digite o Email:");
				String email = sc.next();
				System.out.println("Digite o Telefone:");
				String telefone = sc.next();
				/*
				 *  Objeto Proprietario
				 */
				Proprietario p = new Proprietario(null, nome, email, telefone);
				Dao<Proprietario> dp = new Dao<>(Proprietario.class);
				System.out.println("Inserindo Proprietario........");
				dp.inserir(p);
				System.out.println("Proprietario Inserido com sucesso!!!");
				System.out.println(p);
				
				sc.close();
				
			}catch(Exception e) {
				System.out.println("Algo Deu errado");
			}
	
		}else if (op == 4) {
			/*
			 *  Atualizar
			 */
			try {
				Proprietario prop = new Proprietario
						(13L,"Joao Paulo","joaopaulo@email.com","61-9877-6633");
				Dao<Proprietario> dp = new Dao<>();
				dp.atualizar(prop);
			}finally {
				System.out.println("Dados Atualizados");
			}

		}else if (op == 5) {
			/*
			 *  Deletar Veículo
			 */
			Scanner sc = new Scanner(System.in);
				System.out.println("Digite o Codigo que deseja excluir:");
				Long id = sc.nextLong();
				
				Dao<Veiculo> dv = new Dao<>(Veiculo.class);
				dv.remover(id);
				
			sc.close();
	
		}else if (op == 6) {
			/*
			 *  Consulta Proprietario pelo Nome
			 */
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Digite o nome que deseja buscar:");
				String nome = sc.next();
				
				Dao<Proprietario> dao = new Dao<Proprietario>(Proprietario.class);
				List<Proprietario> prop = dao.findByName(nome);
				
				for (Proprietario p : prop) {
					System.out.println(p);
				}
				sc.close();
				
			}catch(Exception e) {
				System.out.println("Xi!!!!! Deu Ruin");
			}
			
		}
	}catch (Exception e) {
		System.out.println("Favor digitar apenas valores numericos válidos");
	} 
		scan.close();
		}
	
	}//Class

