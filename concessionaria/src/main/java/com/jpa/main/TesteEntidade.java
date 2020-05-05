package com.jpa.main;

import com.jpa.dominio.Placa;
import com.jpa.dominio.Proprietario;
import com.jpa.dominio.Veiculo;

/** Projeto: concessionaria
 *  Classe: Principal.java
 *  Criado em : 4 de mai de 2020
 *  @author jaime Des */

public class TesteEntidade {

	/** @param args */
	public static void main(String[] args) {
		/*
		 *  Prorpietario
		 */
		Proprietario p = new Proprietario
				(1l,"Joaquin Cabral","joaquin@gmail.com","61-9999-6633");
		/*
		 *  Placa
		 */
		Placa placa = new Placa("AAA-1234","Curitiba-PR");
		/*
		 *  Veiculo
		 */
		Veiculo car = new Veiculo(1l,"Ford","Ká",2016,2017,35000.00,placa,p);
		/*
		 * 
		 */
		System.out.println(car);
		

	}

}
