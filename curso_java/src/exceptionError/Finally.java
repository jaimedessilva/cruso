/**
 * 
 */
package exceptionError;

import java.util.Scanner;

/**
 * @author jaime Des
 * Criado em : 6 de abr de 2020
 * exercicios
 */
public class Finally {
	
	public static void main(String[] args) {
	
	try{
		Scanner sc = new Scanner(System.in);
		System.out.println(7 / sc.nextInt());	
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("Finally");
	}
	System.out.println("Fim");
   }
}
