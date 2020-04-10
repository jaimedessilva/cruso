/**
 * 
 */
package jdbc_crud;

/**
 * @author jaime Des Criado em : 7 de abr de 2020 exercicios
 */
public class Usuario {
	protected long id = 1;
	protected String nome;
	protected String email;
	protected String telefone;

	// Construct sem parametros
	public Usuario() {
		super();
	}
	// Construct sem ID
	public Usuario(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	// Construct
	public Usuario(long id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "\n id: " + id + "\n nome: " + nome + "\n email: " + email + "\n telefone: " + telefone;
	}

}
