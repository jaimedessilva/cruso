package fundamentos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		//Variaveis
		var m = "Bem Vindo ao Game, Escolha uma opção";
		var li =" \n 1 - JOGAR \n "
				+ "2 - VER JOGADORES \n "
				+ "3 - VER RECORDS";
		int r = 0;
		
		// OPcoes
		System.out.println("1 - JOGAR");
		System.out.println("2 - VER GANHADORES");
		System.out.println("3 - VER RECORDS");
		System.out.println("4 - SAIR");
		
		//Entrada scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite Uma das Opcoes:");
		int n = sc.nextInt();
		
		//Enquanto opção for diferente de 4 executa
		while (n != 4) {
			System.out.println("Digite Uma das Opcoes:");
			n = sc.nextInt();
			//ElseIf aninhados
			if (n == 1) {
				System.out.println("Jogar");
			} else if (n == 2) {
				System.out.println("Ver Ganhadores");
				int x = 1;
				while (x <= 10) {
					System.out.println("Ganhadores: " + x);
					x++;
				}
			} else if (n == 3) {
				System.out.println("Ver Records");
			} else {
				System.out.println("Sair");
			}
		}
		//Sair
		sc.close();
	}
}
