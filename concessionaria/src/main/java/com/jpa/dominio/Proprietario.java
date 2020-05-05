package com.jpa.dominio;

import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** Projeto: concessionaria
 *  Classe: Proprietario.java
 *  Criado em : 4 de mai de 2020
 *  @author jaime Des */

@Entity
@Table (name ="proprietario")
public class Proprietario {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 60, nullable = false)
	private String nome;
	@Column(length = 255)
	private String email;
	@Column(length = 20, nullable = false)
	private String telefone;
	@OneToMany (mappedBy = "prop")
	private List<Veiculo> veiculos;
	
	/*
	*  Construct
	*/
	public Proprietario() {}
	/*
	*  Construct
	*/
	public Proprietario(Long id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	@Override
	public String toString() {
		return "\n Prop id: " + id + "\n proprietario: " + nome + "\n email: " + email + "\n telefone: "
				+ telefone;
	}
	
	

}
