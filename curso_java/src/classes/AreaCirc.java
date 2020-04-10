/**
 * 
 */
package classes;
/**
 * @author jaime Des
 * Criado em : 29 de mar de 2020
 * exercicios
 */

public class AreaCirc {
	double raio;
	static final double pi = 3.14;//Modificador Static(Pertence a Classe) e final(Constante)
	
	AreaCirc (double raioInicial){
		raio = raioInicial;
	}
	double area () {
		return raio * raio * pi;
	}
}
