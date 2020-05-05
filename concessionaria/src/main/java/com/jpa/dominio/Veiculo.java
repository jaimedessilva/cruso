package com.jpa.dominio;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** Projeto: concessionaria
 *  Classe: Veiculo.java
 *  Criado em : 4 de mai de 2020
 *  @author jaime Des */

@Entity
@Table (name = "veiculo")
public class Veiculo {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 60)
	private String fabricante;
	@Column(length = 60)
	private String modelo;
	@Column(name = "ano_fab")
	private int anoFab;
	@Column(name = "ano_mod")
	private int anoMod;
	@Column(precision = 10, scale = 2)
	private double valor;
	@Embedded //Classe Placa Veículo
	private Placa placa;
	@ManyToOne
	@JoinColumn (name="prop_id")
	private Proprietario prop;
	/*
	*  Construct
	*/
	public Veiculo() {}
	/*
	*  Construct
	*/
	public Veiculo(Long id, String fabricante, String modelo, int anoFab, int anoMod, double valor, Placa placa,
			Proprietario prop) {
		super();
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFab = anoFab;
		this.anoMod = anoMod;
		this.valor = valor;
		this.placa = placa;
		this.prop = prop;
	}
	public long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public int getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	public int getAnoMod() {
		return anoMod;
	}
	public void setAnoMod(int anoMod) {
		this.anoMod = anoMod;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Placa getPlaca() {
		return placa;
	}
	public void setPlaca(Placa placa) {
		this.placa = placa;
	}
	public Proprietario getProp() {
		return prop;
	}
	public void setProp(Proprietario prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "Veiculo id: " + id + "\n fabricante: " + fabricante + "\n modelo: " + modelo + "\n anoFab: " + anoFab
				+ "\n anoMod: " + anoMod + "\n valor: " + valor + "\n placa: " + placa + "\n " + prop;
	}
	
	
}
