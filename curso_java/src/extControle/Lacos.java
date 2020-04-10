/**
 * 
 */
package extControle;

/**
 * @author jaime Des
 * Criado em : 29 de mar de 2020
 * exercicios
 */
public class Lacos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Lacos de repeticao
		
		// ---------------------------------------------------------||
		// Laço FOR ------------------------------------------------||
		//----------------------------------------------------------||
		int i;//indice
		var nome = "Jaime";
		for (i = 0;i <= 10 ; i++) {
			 System.out.println("Nome: " + i +"-"+ nome);
		 }
		System.out.println("--");
		
		// ---------------------------------------------------------||
		// Laço FOR ------------------------------------------------||
		//----------------------------------------------------------||
		int x = 0;
		while (x <= 15) {
			System.out.println("Nome: " + x +"-"+ nome);
			x++;
		}
		// Percorrer Array -----------------------------------------||
		// ---------------------------------------------------------||
		// Laço FOR ------------------------------------------------||
		//Array de valores------------------------------------------||
		
		double[]notas = {1.1,2.2,3.3,4,4,5,5};
		//For
		int a = 0;
		for (; a < notas.length;a++)
		System.out.println(notas[a]);
		
		//While
		System.out.println("--");
		int z = 0;
		while(z < notas.length) {
			System.out.println(notas[z]);
			z++;
		}
		System.out.println("--");
		
		//ForEach
		for (double nota: notas) {
			System.out.println("\n" +nota );
		}
	}//Main
}//Class
