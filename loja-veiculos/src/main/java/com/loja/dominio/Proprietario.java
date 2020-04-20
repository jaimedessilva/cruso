package com.loja.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** Projeto: loja-veiculos
 *  Classe: Proprietario.java
 *  Criado em : 20 de abr de 2020
 *  @author jaime Des */

@Entity
@Table (name="t_proprietario")
public class Proprietario {
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long id;
		@Column (length = 60, nullable = false)
		private String nome;
		@Column (length = 20, nullable = false)
		private String telefone;
		@Column (length = 255)
		private String email;
		@OneToOne(mappedBy = "prop") //Mesmo nome do Atributo na Classe Veículo
		private Veiculo veiculo;

	/*
	 * Construct
	 */
	public Proprietario() {}
	/*
	 *  Construct Fields 
	 */
	public Proprietario(Long id, String nome, String telefone, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "\n Proprietario nome: " + nome 
				+ "\n telefone: " + telefone 
				+ "\n email: " + email 
				+"\n Veículo: "+ veiculo.getModelo();
	}

}
