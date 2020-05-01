package com.loja.principal;

import java.util.ArrayList;
import java.util.List;

import com.loja.dominio.Acessorio;
import com.loja.dominio.Proprietario;
import com.loja.dominio.TipoCombustivel;
import com.loja.dominio.Veiculo;
import com.loja.dominio.VeiculoPlaca;

/** Projeto: loja-veiculos
 *  Classe: Testa.java
 *  Criado em : 21 de abr de 2020
 *  @author jaime Des */

public class Testa {

	public static void main(String[] args) {
		/*
		 *  Acessório
		 */
		Acessorio ac1 = new Acessorio(null,"Roda de Liga Leve",null);
		Acessorio ac2 = new Acessorio(null,"Sensor de Estacionamento",null);
		Acessorio ac3 = new Acessorio(null,"MP3 Player",null);
		Acessorio ac4 = new Acessorio(null,"Pintura Metalizada",null);
		
		Object acessorios[]= {ac1,ac2,ac3,ac4};
		
		for (Object obj : acessorios) {
			//System.out.println(obj);
		}
		
		/*
		 *  Proprietario
		 */
		Proprietario prop = new Proprietario(null,"Estiven Son","estiven@gmail.com","61-9999-6666");
		/*
		 * Placa
		 */
		VeiculoPlaca placa = new VeiculoPlaca("AAA-123","St Catarina");
		System.out.println(placa);
		/*
		 * Veiculo
//		 */
		Veiculo v = new Veiculo(null,placa,"Mercedes Benz","CLK-GTR",2019,2020,
				259000.79, TipoCombustivel.GASOLINA,"",prop,null);
		System.out.println(v);
		
	}

}
