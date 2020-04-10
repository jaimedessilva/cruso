/**
 * 
 */
package classes;

/**
 * @author jaime Des Criado em : 29 de mar de 2020 exercicios
 */
public class Carro {
	// Attr
	String nome;
	String marca;
	String cor;

	// metod
	String printObj() {

		nome = nome;
		this.marca = marca;
		this.cor = cor;
		// Imprime atributos da Classe
		String obj = nome + "\n" + marca + "\n" + cor;

		return obj;

	}
	void impress () {
		System.out.println(nome);
		System.out.println(marca);
		System.out.println(cor);
	}
}
