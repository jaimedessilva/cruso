/**
 * 
 */
package heranca;

/**
 * @author jaime Des
 * Criado em : 2 de abr de 2020
 * exercicios
 */
public class Filho extends Pai {
	
	String habilidade;
	
	public Filho(String nome, int idade, String etnia, String profissão, String habilidade) {
		super(nome, idade, etnia, profissão);
		this.habilidade = habilidade;
	}

	public Filho() {
		super();	
	}

	boolean jogarBola() {
		if (habilidade.equalsIgnoreCase("Jogar bola"))	{
			return true;
		}else 
		return false;
	}
	@Override
	public String toString() {
		return "Filho [habilidade=" + habilidade + ", nome=" + nome + ", idade=" + idade + ", etnia=" + etnia
				+ ", profissão=" + profissao + ", jogarBola()=" + jogarBola() + ", trabalhar()=" + trabalhar()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
