/**
 * 
 */
package oo.composicao;

/**
 * @author jaime Des
 * Criado em : 31 de mar de 2020
 * exercicios
 */
public class Motor {
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) {
		 return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
