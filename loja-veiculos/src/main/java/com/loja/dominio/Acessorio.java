package com.loja.dominio;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/** Projeto: loja-veiculos
 *  Classe: Acessorio.java
 *  Criado em : 20 de abr de 2020
 *  @author jaime Des */

@Entity
@Table (name="t_acessorio")
public class Acessorio {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 60, nullable = false)
	private String descricao;
	@ManyToMany (mappedBy = "acessorios")
	private Set<Veiculo> v;

	/*
	*  Construct
	*/
	public Acessorio() { super();}
	
	/*
	*  Construct
	*/
	public Acessorio(Long id, String descricao, Set<Veiculo> v) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.v = v;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "\n Acessorio id: " + id + "\n Acessorio: " + descricao + "\n Veículo: " + v;
	}
	
}
