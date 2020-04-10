package oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** Projeto: curso_jpa
 *  Classe: Cliente.java
 *  Criado em : 10 de abr de 2020
 *  @author jaime Des */

@Entity
@Table (name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nome;
	@OneToOne  //Anotation de Relacionamento 1 para 1
	@JoinColumn (name ="assento_id") // Manter a Integridade de Uma coluna
	private Assento assento;
	//Construct 1
	public Cliente() {
		//Padrao
	}
	//Construct 2 Parametros
	public Cliente(String nome, Assento assento) {
		super();
		this.nome = nome;
		this.assento = assento;
	}
	//Getter Setter
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
	public Assento getAssento() {
		return assento;
	}
	public void setAssento(Assento assento) {
		this.assento = assento;
	}
	@Override //toString
	public String toString() {
		return "Cliente id: " + id + " nome: " + nome + " assento: " + assento;
	}
}
