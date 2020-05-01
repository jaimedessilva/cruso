package com.loja.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**Projeto: loja-veiculos 
 * Classe: Proprietario.java 
 * Criado em : 20 de abr de 2020
 * @author jaime Des **/

@Entity
@Table(name = "t_proprietario")
public class Proprietario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 60, nullable = false)
	private String nome;
	@Column(length = 255)
	private String email;
	@Column(length = 20, nullable = false)
	private String telefone;
	@OneToMany(mappedBy = "prop") // Mesmo nome do Atributo na Classe Veículo
	private List<Veiculo> veiculos;

	/*
	 * Construct
	 */
	public Proprietario() {}

	/*
	 * Construct Fields
	 */
	public Proprietario(Long id, String nome,String email,String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public Long getId() {
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

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	@Override
	public String toString() {
		return "\n Proprietário: " + nome + "\n email: " + email + "\n telefone: " + telefone;

	}

}
