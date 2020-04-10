package fundamentos;

import java.util.Scanner;

public class Scanner1 {


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite o seu Nome:");
		 
		 String nome = sc.nextLine();
		 System.out.println("Seu Nome é: " + nome);
		 sc.close();
	
	}

}
