package extControle;

import java.util.Scanner;
//Estrutura de controle IF
public class If {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe a média");
		double media = ent.nextDouble();

		if (media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parabens!!!");

		}
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
			System.out.println("Estude mais para recuperar");
		}
		if (media <= 4.5 && media >= 0) {
			System.out.println("Reprovado");
			System.out.println("Infelizmente!!!");
		}
		ent.close();
	}
}
