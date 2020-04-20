package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Projeto: App_pedidos_jpa
 *  Classe: ItemProduto.java
 *  Criado em : 13 de abr de 2020
 *  @author jaime Des */

@Entity
@Table (name="t_produto")
public class ItemProduto implements Serializable {
	/**/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 100)
	private String nome;
	@Lob
	private String descricao;
	@Column(precision = 10, scale = 2, nullable = true)
	private Double valor;
	@ManyToMany (mappedBy = "item")
	private Set<Pedido> ped = new HashSet<>();
	
	//Construct
	public ItemProduto() {
		
	}
	//Construct
	public ItemProduto(Long id, String nome, String desc, Double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = desc;
		this.valor = valor;
	}
	/*
	 * Getters Setters
	 */
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
	public String getDesc() {
		return descricao;
	}
	public void setDesc(String desc) {
		this.descricao = desc;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "ItemProduto: \n id: " + id + "\n nome: " + nome + "\n desc: " + descricao + "\n valor: " + valor;
	}
}
