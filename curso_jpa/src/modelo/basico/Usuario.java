/**
 * 
 */
package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/** @author jaime Des
 *  Criado em : 8 de abr de 2020
 *  curso_jpa
 *  Entidade de Persistencia no Banco */

@Entity
@Table (name="usuario")
public class Usuario {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)//Auto_increment
	private long id;
	@Column
	private String nome;
	@Column
	private String email;
	
	public Usuario () {
		//Construtor Padrão
	}
	
	public Usuario (String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	//Getters -- Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return   "\n id: " + id + "\n nome: " + nome + "\n email: " + email 
				+"\n --------------------------";
	}
	
}
