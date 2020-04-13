package oneToMany;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** Projeto: curso_jpa
 *  Classe: Pedido.java
 *  Criado em : 10 de abr de 2020
 *  @author jaime Des */

@Entity
@Table (name="pedido")
public class Pedido {
//	// Data atual
//	Date dt = new Date();
//	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (nullable=true)
	private Date date;
	
	@OneToMany (mappedBy = "pedido")
	private List<ItemPedido> items;

	//Construct
	public Pedido() {
		super();
		
	}
	//Construct
	public Pedido(Long id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}
	//Get Set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public List<ItemPedido> getItems() {
		return items;
	}

	public void setItems(List<ItemPedido> items) {
		this.items = items;
	}
	
}
