/**
 * 
 */
package objectArrayCollection;

import java.util.HashSet;

/**
 * @author jaime Des
 * Criado em : 30 de mar de 2020
 * exercicios
 */
public class HshSet {

		public static void main(String[] args) {
			//Lista não ordenada que não aceita elementos repetidos
			HashSet conj = new HashSet();
			 conj.add(1.2);
			 conj.add(true);
			 conj.add("teste");
			 conj.add(1);
			 conj.add('x');
			 
			 int x = 0;
			 while (x < conj.size()) {
				// System.out.println(conj);
				 x++;
			 }
			 
			 
			 System.out.println("Conjunto: "+ conj);
			 
			 conj.add("teste");//Repetido
			 conj.add('x');
			 
			System.out.println("Conjunto: "+ conj);
			
			conj.remove("teste");
			conj.remove('x');
			
			System.out.println("Conjunto:" + conj);
			 
			 
			 
			 
			 
			 
			
		}
}
