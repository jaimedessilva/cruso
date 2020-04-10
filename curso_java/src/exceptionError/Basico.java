/**
 * 
 */
package exceptionError;

/**
 * @author jaime Des
 * Criado em : 3 de abr de 2020
 * exercicios
 */
public class Basico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			System.out.println(7 / 0);
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " +e.getMessage());
		}
	}
}
