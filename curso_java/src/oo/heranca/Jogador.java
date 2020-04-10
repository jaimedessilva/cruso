/**
 * 
 */
package oo.heranca;

/**
 * @author jaime Des
 * Criado em : 1 de abr de 2020
 * exercicios
 */
public class Jogador {
	
	int x;
	int y;
	
	boolean andar(Direcao d) {
		switch(d) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}

}
