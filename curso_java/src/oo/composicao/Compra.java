/**
 * 
 */
package oo.composicao;

import java.util.ArrayList;

/**
 * @author jaime Des
 * Criado em : 31 de mar de 2020
 * exercicios
 */
public class Compra {
    String cliente; 
	ArrayList<Item> itens = new ArrayList<Item>();
     
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item i: itens) {
			total += i.quantidade * i.preco;
		}
		return total;
	}

		
}

