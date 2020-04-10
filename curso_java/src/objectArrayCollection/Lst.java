/**
 * 
 */
package objectArrayCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jaime Des
 * Criado em : 31 de mar de 2020
 * exercicios */

public class Lst {
	
	public static void main(String[] args) {
		
		//Instancia Classe Usuario
		Usuario u = new Usuario("Jaime");
		
		List<Usuario>lista = new ArrayList<>();
		
		lista.add(u);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Manu"));
		
		//ForEach
		for (Usuario us: lista) {
			System.out.println(us.nome);
		}
	}

}
