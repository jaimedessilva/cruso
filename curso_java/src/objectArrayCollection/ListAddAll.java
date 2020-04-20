package objectArrayCollection;

import java.util.ArrayList;
import java.util.List;

/** Projeto: curso_java
 *  Classe: ListAddAll.java
 *  Criado em : 12 de abr de 2020
 *  @author jaime Des */

public class ListAddAll {
/*
 * Classe que adiciona um Array dentro de uma List
 */ 
	/** @param args */
	public static void main(String[] args) {
		//Array Generico
//		Object obj[] = new Object[5];
//		obj[0]="Caio";
//		obj[1]="Matheus"; 
//		obj[2]= 2005.88;
//		obj[3]= 111;
//		obj[4]= 1_000_888_999_87L;


		//Lista Generica recebe qualquer coisa
		String nomes[]= {"Jaime","Caio","Pedro","Sebastião","Sebastiana","Stefany"};
		int qtd = nomes.length;
		
		List<String> lst = new ArrayList<>();
		if (qtd > 0) {
			for (int i = 0; i < qtd; i++) {
				lst.add(nomes[i]);
			}
			//System.out.println("Array com: " +qtd + " Posições");
		}else {
			System.out.println("Array Vázio");
		}
		for (String l : lst) {
			System.out.println(l);
		}
		
	}
}
