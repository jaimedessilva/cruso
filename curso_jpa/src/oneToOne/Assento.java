package oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** Projeto: curso_jpa 
 * Classe: Assento.java 
 * Criado em : 10 de abr de 2020
 *  * @author jaime Des */

@Entity
@Table(name = "assentos")
public class Assento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String nome;
	@OneToOne
	private Cliente cli;

	public Assento() {
		// Construct Padrao
	}

	public Assento(String nome) {
		super();
		this.nome = nome;
	}

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

	@Override //toString
	public String toString() {
		return "Assento id: " + id + " nome: " + nome;
	}
	
}
