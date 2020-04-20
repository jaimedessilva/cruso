package objectArrayCollection;

import java.util.Random;

/** Projeto: curso_java
 *  Classe: ArrayVetor.java
 *  Criado em : 10 de abr de 2020
 *  @author jaime Des */

public class ArrayVetor {
	
	public static void main(String[] args) {
		System.out.println("----------------------------");
		System.out.println("Array de Tamanho variável");
		System.out.println("----------------------------");
		
		//Array de Tamanho variável
		int array[]= {10,20,30,40,50,101,999,1897,2020};
		//Percorrendo
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("----------------------------");
		System.out.println("Array de Tamnaho Fixo");
		System.out.println("----------------------------");
		
		//Array de Tamanho Fixo
		int qtd = 5;
		int i = 0;
		String vet[] = new String[qtd];
			vet[0]="Joaquin";
			vet[1]="Carlos";
			vet[2]="João";
			vet[3]="Matheus";
			vet[4]="Sebastião";
			//ForEach
			for (Object lst : vet) {
				System.out.println(lst);
			}
		System.out.println("----------------------------");
		System.out.println("Percorrendo com While");
		System.out.println("----------------------------");
			
			while (i < vet.length ) {
				System.out.println(vet[i]);
				i++;
			}
		System.out.println("----------------------------");
		System.out.println("Populando um Array c nº aleatorios");
		System.out.println("----------------------------");
		 
		 //Populando um array com número Randonicos	
		 Random r = new Random();
		 //Qtd de Repetição
		 int qtde = 7;
		 //Array
		 int nums[] = new int[qtd];	
		 //Insere valores no Vetor
		 for (int x = 0; x < qtd; x++ ) {
			 nums[x] = r.nextInt();
		 }
		 //Imprime Valores
		 for (int x = 0;x < nums.length; x ++ ) {
			 System.out.println("Vetor nº:"+ x +"=>"+nums[x]);
		 }
		 System.out.println("----------------------------");
		 System.out.println("Matriz");
		 System.out.println("----------------------------");
		 
		 //Matriz
		 int mat[][] = new int [2][2];
		 	mat[0][0]= 10;
		 	mat[0][1]= 20;
		 	mat[1][0]= 30;
		 	mat[1][1]= 40;
	 	
		 	int a,b;
		 	for (a = 0; a < mat.length; a++) {
		 		for (b = 0; b < mat.length; b++) {
		 			System.out.println(mat[a][b]);
		 		}
		 	}
		 	//Matriz de Object
		 	Object obj[][] = new Object[2][2];
			 	obj[0][0]= 10;
			 	obj[0][1]= "Bruce";
			 	obj[1][0]= 30;
			 	obj[1][1]= "Felipe";
		 	
			for (int i1 = 0; i1 < mat.length; i1++) {
		 		for (int i2 = 0; i2 < mat.length; i2++) {
		 			System.out.println(obj[i1][i2]);
		 		}
		 	}

	}		
}

