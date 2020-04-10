/**
 * 
 */
package oo.heranca;

/**
 * @author jaime Des
 * Criado em : 1 de abr de 2020
 * exercicios
 */
public class Jogo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		j1.x = 10;
		j1.y = 10;
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		
		System.out.println(j1.y);
		System.out.println(j1.x);
	}

}
