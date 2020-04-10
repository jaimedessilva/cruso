/**
 * 
 */
package fundamentos;

/**
 * @author jaime Des
 * Criado em : 30 de mar de 2020
 * exercicios
 */
public class Comparacao {

	public static void main(String[] args) {
		//Comparacao
		int a = 10;
		int b = 10;
		//
		String c = "jaime";
		String d = "jaime";
		//
		String e = "CEBola";
	    String f = "cebola";
		if (a == b) {
			System.out.println( a +"\n"+b);
		}
		if (c == d) {
			System.out.println(c);
		}else {
			System.out.println("Valores diferentes");
		}
		if (e.equalsIgnoreCase(f)) {
			System.out.println(e +" = "+ f);
		}else {
			System.out.println(e +" Não é igual " + f);
		}
		
	}

}
