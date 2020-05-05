package com.jpa.dominio;

import javax.persistence.Embeddable;

/** Projeto: concessionaria
 *  Classe: Placa.java
 *  Criado em : 4 de mai de 2020
 *  @author jaime Des */
/*
 *  Classe Embutida em Veiculo
 */
@Embeddable
public class Placa {
	
	private String placa;
	private String cidade;

	/*
	*  Construct void
	*/
	public Placa() { super();}
	/*
	*  Construct fields
	*/
	public Placa(String placa, String cidade) {
		super();
		this.placa = placa;
		this.cidade = cidade;
	}
	/*
	 *  Getter Setter
	 */
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	/*
	 *  ToString
	 */
	@Override
	public String toString() {
		return "Placa: " + placa + "-" + cidade;
	}
}
