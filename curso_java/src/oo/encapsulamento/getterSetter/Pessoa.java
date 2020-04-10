/**
 * 
 */
package oo.encapsulamento.getterSetter;

/**
 * @author jaime Des
 * Criado em : 3 de abr de 2020
 * exercicios
 */
public class Pessoa {
	private int idade;
	private String nome;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pessoa(int idade) {
		setIdade(idade);
	}
	//Metodo público para ler idade
	//Getter
	public int getIdade () {
		return idade;
	}
	//Metodo Publico que retorna a idade
	//Setter
	public void setIdade(int nIdade) {
		nIdade = Math.abs(nIdade);//Transforma valor Negativo em Positivo
		if (nIdade <= 0 && nIdade <= 120) {
			this.idade = idade;
		}
	}
}
