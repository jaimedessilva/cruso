/** */
package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** curso_jpa
 *  Produto.java
 *  Criado em : 9 de abr de 2020
 *  @author jaime Des */

@Entity
@Table (name = "produto", schema = "CURSO_JAVA")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column (name = "prod_nome", length = 200, nullable = false)
	private String nome;
	@Column (name = "prod_preco", nullable = false, precision = 11, scale = 2 )
	private Double preco;
	/** */
	public Produto() {
		
	}
	/** @param nome
	/** @param preco*/
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	//Getter && Setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "\n id:" + id + "\n nome:" + nome + "\n preco:" + preco;
	}
}
