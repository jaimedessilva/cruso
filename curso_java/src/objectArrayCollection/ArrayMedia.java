/**
 * 
 */
package objectArrayCollection;

import java.util.Scanner;

/**
 * @author jaime Des
 * Criado em : 29 de mar de 2020
 * exercicios
 */
public class ArrayMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos ? ");
		int qtdalunos = sc.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int qtdNotas = sc.nextInt();
		
		//Armazena informações na Matriz
		double[][] notasDaTurma = new double[qtdalunos][qtdNotas];
		
		double total = 0;
		//Matriz
		for (int a = 0; a < notasDaTurma.length;a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.println("Informe a nota do aluno: "+"\n"+ n +"\n"+ a);
				notasDaTurma[a][n] = sc.nextDouble();
				total += notasDaTurma[a][n];
			}
			//Cast converte Double em Int
			double media = (int)total / (qtdalunos * qtdNotas);
			System.out.println("Média da Turma:" + media);
		}
		
		sc.close();
		

	}

}
