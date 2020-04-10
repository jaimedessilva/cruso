/**
 * 
 */
package oo.composicao;

/**
 * @author jaime Des
 * Criado em : 31 de mar de 2020
 * exercicios
 */
public class Carro {
	Motor mot = new Motor();
	
	void acelerar () {
		mot.fatorInjecao += 0.4;
	}
	void frear () {
		mot.fatorInjecao -= 0.4;
	}
	void ligar (){
		mot.ligado = true;
	}
	void desligar (){
		mot.ligado = false;
	}
}
