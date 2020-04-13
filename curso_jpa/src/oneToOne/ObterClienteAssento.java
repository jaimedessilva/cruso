package oneToOne;

import infra.Dao;

/** Projeto: curso_jpa
 *  Classe: ObterClienteAssento.java
 *  Criado em : 10 de abr de 2020
 *  @author jaime Des */

public class ObterClienteAssento {

	/** @param args */
	public static void main(String[] args) {
		Dao<Cliente> dao = new Dao<>(Cliente.class);
		
		Cliente c = dao.getById(1L);
		System.out.println(c.getAssento().getNome());
		
		dao.fecharDao();

	}

}
