package teste.oneToMany;

import infra.Dao;
import oneToMany.ItemPedido;
import oneToMany.Pedido;

/** Projeto: curso_jpa
 *  Classe: BuscarPedido.java
 *  Criado em : 11 de abr de 2020
 *  @author jaime Des */

public class BuscarPedido {

	/** @param args */
	public static void main(String[] args) {
		
		Dao<Pedido> dao = new Dao<>(Pedido.class);
		
		Pedido ped = dao.getById(1L);
		
		for (ItemPedido item: ped.getItems()) {
			System.out.println(item.getQtd());
		}
		dao.fecharDao();

	}

}
