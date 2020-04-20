package generics;

/** Projeto: curso_java
 *  Classe: ObjCarro.java
 *  Criado em : 11 de abr de 2020
 *  @author jaime Des */

public class ObjCarro {
	
	private int id = 100;
	private String nome;
	private String cor;
	private Double motor;
	
	//Construct
	public ObjCarro() {
		// TODO Auto-generated constructor stub
	}
	public ObjCarro (int id) {
		this.id = id;
	}
	//Construct
	public ObjCarro(String nome, String cor, Double motor) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		return "ObjCarro \n id: " + id + "\n nome: " + nome + "\n cor: " + cor + "\n motor: " + motor;
	}
	
	
}
