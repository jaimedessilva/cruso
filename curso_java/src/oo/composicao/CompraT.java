/**
 * 
 */
package oo.composicao;

/**
 * @author jaime Des
 * Criado em : 31 de mar de 2020
 * exercicios
 */
public class CompraT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Joao Pedro";
		c1.itens.add(new Item("Caderno",10,10.50));
		c1.itens.add(new Item("Lapis",10,1.50));
		c1.itens.add(new Item("Tesoura",10,5.50));
		c1.itens.add(new Item("Caneta",10,2.50));
		
		System.out.println(c1.itens.size());
		
		
	}

}
