/**
 * 
 */
package classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author jaime Des 
 * Criado em : 31 de mar de 2020 exercicios
 */
public class Pessoa {
	String nome;
	double altura;
	double peso;
	int nasc;
	Calendar ano = GregorianCalendar.getInstance();
	int idade;
	double imc;

	public Pessoa() {

	}
	//Construct
	public Pessoa(String nome, double altura, double peso, int nasc) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.nasc = nasc;
	}
	//Calc IMC
	double calculaIMC() {
		this.imc = peso / (altura * 2);
		return imc;
	}
	//Calc Idade
	int calculaIdade() {

		this.idade = idade = ano.get(Calendar.YEAR) - nasc;
		return idade;
	}
	//Print Obj
	String getObj() {
		return "Nome: " + nome + "\n" + "altura:" + altura + "\n" + "Peso:" + peso + "\n" + "idade:" + calculaIdade()
				+ "\n" + "IMC: " + calculaIMC() + "\n" + "----------------------------";
	}
}
