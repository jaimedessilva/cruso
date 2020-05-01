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
 * Classe VeiculoPlaca Embutida na classe Veiculo
 */
@Embeddable //Classe que pode ser embutida em outra
public class VeiculoPlaca implements Serializable {
	/**/
	private static final long serialVersionUID = 1L;
	private String placa;
	private String cidade;
	
	/*
	 * Construct
	 */
	
	public VeiculoPlaca() {}
	/*
	 * Construct Fields
	 */
	public VeiculoPlaca(String placa, String cidade) {
		super();
		this.placa = placa;
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "\n Placa: " + placa 
				+ "\n cidade: " + cidade;
	}
	
}
