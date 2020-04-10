package teste.basico;

import infra.Dao;
import modelo.basico.Produto;

/** Projeto: curso_jpa
 *  Classe: CriarProduto.java
 *  Criado em : 9 de abr de 2020
 *  @author jaime Des */

public class CriarProduto {

	/** @param args */
	public static void main(String[] args) {
		
		//Inserir Produto JPA
		Produto prod = new Produto("Microondas", 359.89);
		Dao<Produto> dao = new Dao<>(Produto.class);
		dao.abrirT().inserirAtomico(prod).fecharDao();
		
		System.out.println(prod.toString());
	}
}
