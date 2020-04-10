/**
 * 
 */
package heranca;

/**
 * @author jaime Des Criado em : 2 de abr de 2020 exercicios
 */
public class Pai {
	String nome;
	int idade;
	String etnia;
	String profissao;

	// Construct
	public Pai() {

	}
	// Construct
	public Pai(String nome, int idade, String etnia, String profissão) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.etnia = etnia;
		this.profissao = profissão;
	}

	public boolean trabalhar() {
		if (profissao == ("")) {
			return false;
		}
	return true;
		
	}

	public String toString() {
		return "Nome:" + nome + "\n Idade: " + idade + "\n Etnia:" + etnia + "\n Profissão: " + profissao
				+ "\n Trabalhando:" + trabalhar();
	}
}
