package generics;

/** Projeto: curso_java
 *  Classe: ObjPessoa.java
 *  Criado em : 11 de abr de 2020
 *  @author jaime Des */

public class ObjPessoa {
	
	private String nome;
	private int idade;
	private double peso;

	//Construct
	public ObjPessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Construct
	public ObjPessoa(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "ObjPessoa \n nome: " + nome + "\n idade: " + idade + "\n peso: " + peso;
	}
}
