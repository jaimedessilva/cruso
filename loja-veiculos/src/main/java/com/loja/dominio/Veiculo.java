package com.loja.dominio;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

/** Projeto: loja-veiculos
 *  Classe: Veiculo.java
 *  Criado em : 14 de abr de 2020
 *  @author jaime Des */

@Entity
@Table (name="t_veiculo")
public class Veiculo {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@EmbeddedId //Coluna Classe embutida
	private VeiculoId id;
	@Column (length = 60)
	private String fabricante;
	@Column (length = 60)
	private String modelo;
	@Column (name="ano_fabricacao")
	private Integer anoFabricacao;
	@Column (name="ano_modelo")
	private Integer anoModelo;
	@Column (precision = 10, scale = 2)
	private Double valor;
	@Column (name="tipo_combustivel")
	@Enumerated (EnumType.STRING) //Enum TipoCombustivel
	private TipoCombustivel tipoComb;
	@Lob  //LongText
	private String especificacao;
	@OneToOne
	@JoinColumn
	private Proprietario prop;
	/*
	 * Construct
	 */
	public Veiculo() {}
	/*
	 *  Construct Fields
	 */
	public Veiculo(VeiculoId id, String fabricante, String modelo, Integer anoFabricacao, Integer anoModelo,
			Double valor, TipoCombustivel tipoComb, String especificacao, Proprietario prop) {
		super();
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.tipoComb = tipoComb;
		this.especificacao = especificacao;
		this.prop = prop;
	}
	/*
	 * Getter Setter
	 */
	public VeiculoId getId() {
		return id;
	}
	public void setId(VeiculoId id) {
		this.id = id;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Integer getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public TipoCombustivel getTipoComb() {
		return tipoComb;
	}
	public void setTipoComb(TipoCombustivel tipoComb) {
		this.tipoComb = tipoComb;
	}
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	public Proprietario getProp() {
		return prop;
	}
	public void setProp(Proprietario prop) {
		this.prop = prop;
	}
	/*
	 * toString Imprime o Objeto
	 */
	@Override
	public String toString() {
		return "Veiculo \n id: " + id + "\n fabricante: " + fabricante + "\n modelo: " + modelo + "\n anoFabricacao: "
				+ anoFabricacao + "\n anoModelo: " + anoModelo + "\n valor: " + valor 
				+ "\n Combustivel:" +tipoComb.toString()
				+"\n Desc: " + especificacao + "\n Proprietario:"+ prop.toString();
	}
	
}




