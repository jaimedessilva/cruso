package com.jpa.main;

import java.util.List;
import java.util.Scanner;
import com.jpa.dao.DaoImp;
import com.jpa.dominio.Placa;
import com.jpa.dominio.Proprietario;
import com.jpa.dominio.Veiculo;

/** Projeto: concessionaria
 *  Classe: Programa.java
 *  Criado em : 4 de mai de 2020
 *  @author jaime Des */

public class Programa {

	/** @param args */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		System.out.println("0 - Listar \n"
				+ "1 - Cadastrar \n"
				+ "2 - Atualizar \n"
				+ "3 - Excluir \n"
				+ "4 - Pesquisar ID \n"
				+ "5 - Pesquisar Nome");

		int op = scan.nextInt();
		
		if (op == 0) {
			/*
			 *  Listar
			 */
			DaoImp<Veiculo> dao = new DaoImp<>(Veiculo.class);
			System.out.println(dao.getAll());
			
		}else if (op == 1) {
		/*
		 *  Criar
		 */
			//Proprietario
			Proprietario p = new Proprietario
					(null,"Jorge Henrique","joerge@gmail.com","61-7777-7733");
			//Placa
			Placa placa = new Placa("AAA-1234","Maranhão-MA");
			//Veiculo
			Veiculo car = new Veiculo(null,"Toyota","Camry",2017,2017,58900.89,placa,p);
			DaoImp dao = new DaoImp<>();
					
					dao.create(p);
					dao.create(car);
					dao.closeT();
							
		
		}else if (op == 2) {
			/*
			 *  Atualizar
			 */
			
			//Classes
			DaoImp<Veiculo> dv = new DaoImp<>(Veiculo.class);
			DaoImp<Proprietario> dp = new DaoImp<>(Proprietario.class);
			Placa placa;
			Proprietario p;
			Veiculo car;
			
			//Placa
			placa = new Placa("ACC-1111","Curitiba-PR");
			//Proprietario
			p = dp.getById(5L); // Obtem o Proprietario pelo ID
			//Veiculo
			car = new Veiculo();
			
			car.setId(3L); //Muito Importante o ID
			car.setPlaca(placa);
			car.setFabricante("Volkswagen");
			car.setModelo("Gol");
			car.setAnoFab(2018);
			car.setAnoMod(2018);
			car.setValor(42899.89);
			car.setProp(p);
			
			System.out.println(dv.update(car));
				
		}else if (op == 3) {
			/*
			 *  Deletar
			 */
			Veiculo car = new Veiculo();
			DaoImp<Veiculo> dao = new DaoImp<>(Veiculo.class);
			dao.delete(7l);
	
		}else if (op == 4) {
			/*
			 * Pesquisar Id
			 */
			DaoImp<Proprietario> dao = new DaoImp<>(Proprietario.class);
			System.out.println(dao.getById(5L));
			
		}else if (op == 5) {
			/*
			 *  Pesquisar Nome
			 */
			DaoImp<Proprietario> dp = new DaoImp<>(Proprietario.class);
			System.out.println(dp.getByName("jo"));
			
		}else if (op == 6) {
			/*
			 *  Sair
			 */
		DaoImp dao = new DaoImp();
		dao.closeT();
			
		}
		
		scan.close();

	}

}
