package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Projeto: App_pedidos_jpa
 *  Classe: Pedido.java
 *  Criado em : 13 de abr de 2020
 *  @author jaime Des */
@Entity
@Table (name="t_pedido")
public class Pedido implements Serializable {
	/**/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column (name="data")
	private Date dt;
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn (name ="id_cliente")
	private Pessoa p = new Pessoa();
	@ManyToMany
	@JoinColumn (name = "id_item")
	private Set<ItemProduto> item = new HashSet<>();
	
	//private List<ItemProduto> itens = new ArrayList<>();
	//private ItemProduto item;
	
	//Construct
	public Pedido() {
		//********	
	}
	/*
	 * Constructor
	 */
	public Pedido(Long id, Pessoa p, Date dt ) {
			super();
			this.id = id;
			this.p = p;
			this.dt = dt;
		}
	/*
	 *  Calcula o Total de itens
	 */
	public double calcularTotal() {
		double total = 0.0;
		//item
		return total;
	}
	/*
	 * Getter e Setters
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	public Pessoa getP() {
		return p;
	}
	public void setP(Pessoa p) {
		this.p = p;
	}
	
@Override
	public String toString() {
		return "Pedido id: " + id + " dt: " + dt + " p: " + p;
	}
}
