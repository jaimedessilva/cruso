/**
 * 
 */
package classes;

/**
 * @author jaime Des
 * Criado em : 30 de mar de 2020
 * exercicios
 */
public class Equals {
	public static void main(String[] args) {
		
		String a = "jaime";
		String b = "jaime";
		
		Usuario u = new Usuario();
		u.nome = "Jaime Silva";
		u.email = "jaime@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Jaime Silva";
		u2.email = "jaime@gmail.com";
		u2.equals(u2);
		
		System.out.println(u == u2);
		System.out.println(u.equals(u2));
		
	
		
		
		
		
		
		
		
		
	}

}	
