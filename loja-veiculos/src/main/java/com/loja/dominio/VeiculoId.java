package com.loja.dominio;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

/** Projeto: loja-veiculos
 *  Classe: VeiculoId.java
 *  Criado em : 20 de abr de 2020
 *  @author jaime Des */

/*
 * Classe VeiculoID Embutida em Veiculo 
 */

@Embeddable
public class VeiculoId implements Serializable {
	
	private String placa;
	private String cidade;
	
	
	//Construct
	public VeiculoId() {
		
	}
	/*
	 * Construct Fields
	 */
	public VeiculoId(String placa, String cidade) {
		super();
		this.placa = placa;
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "\n VeiculoId placa: " + placa 
				+ "\n cidade: " + cidade;
	}
	
}
