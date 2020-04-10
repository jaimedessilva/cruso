package oneToOne;

import infra.Dao;

/** Projeto: curso_jpa
 *  Classe: NovoClienteAssento1.java
 *  Criado em : 10 de abr de 2020
 *  @author jaime Des */

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		Assento assento = new Assento("15A");
		Cliente cliente = new Cliente("Bia", assento);
		
		Dao<Object> dao = new Dao<>();
		//Transaçao
		dao.abrirT()
			.inserir(assento)
			.inserir(cliente)
			.fechatT()
			.fecharDao();
		System.out.println("Dados inceridos com sucesso!!!");
	}
}
