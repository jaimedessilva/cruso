package com.loja.dominio;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**Projeto: loja-veiculos 
 * Classe: Veiculo.java 
 * Criado em : 14 de abr de 2020
 * @author jaime Des **/

@Entity
@Table(name = "t_veiculo")
public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Embedded // Classe Placa/Cidade embutida
	private VeiculoPlaca placa;
	@Column(length = 60)
	private String fabricante;
	@Column(length = 60)
	private String modelo;
	@Column(name = "ano_fabricacao")
	private Integer anoFabricacao;
	@Column(name = "ano_modelo")
	private Integer anoModelo;
	@Column(precision = 10, scale = 2)
	private Double valor;
	@Column(name = "tipo_combustivel")
	@Enumerated(EnumType.STRING) // Enum TipoCombustivel
	private TipoCombustivel tipoComb;
	@Lob // LongText
	private String especificacao;
	@ManyToOne
	@JoinColumn(name = "prop_id")
	private Proprietario prop;
	@ManyToMany
	@JoinTable(name = "t_veiculo_acessorio", 
	joinColumns = @JoinColumn(name = "veiculo_id"), 
	inverseJoinColumns = @JoinColumn(name = "acessorio_id")) // Define																																					// Associativa
	private Set<Acessorio> acessorios = new HashSet<>();
	/*
	 * Construct
	 */
	public Veiculo() {}
	/*
	 * Construct
	 */
	public Veiculo(Long id, VeiculoPlaca placa, String fabricante, String modelo, Integer anoFabricacao,
			Integer anoModelo, Double valor, TipoCombustivel tipoComb, String especificacao, Proprietario prop,
			Set<Acessorio> acessorios) {
		super();
		this.id = id;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.tipoComb = tipoComb;
		this.especificacao = especificacao;
		this.prop = prop;
		this.acessorios = acessorios;

	}

	/*
	 * Getter Setter
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VeiculoPlaca getPlaca() {
		return placa;
	}

	public void setPlaca(VeiculoPlaca placa) {
		this.placa = placa;
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
				+ anoFabricacao + "\n anoModelo: " + anoModelo + "\n valor: " + valor + "\n Combustivel:"
				+ tipoComb.toString() + "\n Desc: " + especificacao + "\n" + prop.toString();
	}

}
