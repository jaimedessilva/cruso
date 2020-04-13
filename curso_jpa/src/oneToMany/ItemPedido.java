package oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import modelo.basico.Produto;

/** Projeto: curso_jpa
 *  Classe: ItemPedido.java
 *  Criado em : 10 de abr de 2020
 *  @author jaime Des */

@Entity
@Table (name="item_pedido")
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	private Pedido pedido;
	@ManyToOne
	private Produto p;
	@Column (nullable=false)
    private int qtd;
	@Column (nullable=false)
	private Double preco;
	
	//Constructor
	public ItemPedido() {
		super();
		
	}
	//Construct
	public ItemPedido(Pedido pedido, Produto p, int qtd) {
		super();
		this.setPedido(pedido);
		this.setP(p);
		this.setQtd(qtd);
	}
	
	//Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getP() {
		return p;
	}

	public void setP(Produto p) {
		this.p = p;
		if (p != null && this.preco == null) {
			this.setPreco(p.getPreco());
		}
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
