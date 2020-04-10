/**
 * 
 */
package objectArrayCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jaime Des
 * Criado em : 31 de mar de 2020
 * exercicios
 */
public class HshSetOrd {

	public static void main(String[] args) {
		
		//HashSet de dados Ordenados
		//Insere dados de forma desordenada
	
		Set<String> lista = new HashSet<>();
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Jaime");
		lista.add("Caio");
		
		
		for (String nome: lista)
			System.out.println(nome);

	}

}
