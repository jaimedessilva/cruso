package infra;

import modelo.basico.Produto;

/** Projeto: curso_jpa
 *  Classe: ProdutoDao.java
 *  Criado em : 9 de abr de 2020
 *  @author jaime Des 
 *  Classe que Estende a Classe Dao Generica */

public class ProdutoDao extends Dao<Produto> {

	/** */
	public ProdutoDao() {
		super(Produto.class);
	}
	/** @param classe*/
	public ProdutoDao(Class<Produto> classe) {
		super(classe);
	}
	
}
