/**
 * 
 */
package objectArrayCollection;

import java.util.Scanner;

/**
 * @author jaime Des Criado em : 29 de mar de 2020 exercicios
 */
public class ArrayJogo {

	public static void main(String[] args) {

		// Animal
		String animal = "Elefante";

		Scanner sc = new Scanner(System.in);
		// Entrada
		System.out.println("Digite o nome de um Animal: ");
		String valor = sc.next();
		if (valor.equalsIgnoreCase(animal)) {
			System.out.println("Parabens você acertou");
		}else {
			// laço
			while (!valor.equalsIgnoreCase(animal)) {
				System.out.println(valor);
				String v ="";
				if (!valor.equalsIgnoreCase(animal)) {
					System.out.println("Errou, Digite Novamente: ");
					v = sc.next();
				}else if (v.equalsIgnoreCase(animal)) {
					System.out.println("Acertou");
				}else {
					System.out.println("Sair");
				}
				
			}
		}//else
	}//Main
}//Class
