package extControle;

/**
 * @author jaime Des
 */
/*
 * Classe que calcula a nota de um Nº indefinido de alunos 
 * e depois tira a média
 */

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		 int qtdNotas = 0;
		 double nota = 0;
		 double total = 0;
		 
		 while (nota != -1) {
			 System.out.println("Informe a nota:");
			 nota = sc.nextDouble();
			 
			 if (nota <= 10 && nota >= 0) {
				 
			 }
			 total += nota;
			 qtdNotas++;
		 }
		 //Calcular média
		 double media = total / qtdNotas;
		 System.out.println("Media" + media);
		 
		sc.close();
	}
}