package teste.oneToMany;

import infra.Dao;
import modelo.basico.Produto;
import oneToMany.ItemPedido;
import oneToMany.Pedido;

/** Projeto: curso_jpa
 *  Classe: NovoPedido.java
 *  Criado em : 10 de abr de 2020
 *  @author jaime Des */

public class NovoPedido {

	/** @param args */
	public static void main(String[] args) {
		
		Dao<Object> dao = new Dao<>();
		Produto prod = new Produto("Geladeira", 2789.99);
		Pedido ped = new Pedido();
		ItemPedido item = new ItemPedido(ped, prod ,10);
		
		System.out.println(ped.getDate());
		
		dao.abrirT()
			.inserir(prod)
			.inserir(ped)
			.inserir(item)
			.fechatT()
			.fecharDao();
			
	}
}