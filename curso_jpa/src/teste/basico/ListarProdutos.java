package teste.basico;

import java.util.List;
import javax.sound.sampled.UnsupportedAudioFileException;
import infra.ProdutoDao;
import modelo.basico.Produto;

/** Projeto: curso_jpa
 *  Classe: ListarProdutos.java
 *  Criado em : 9 de abr de 2020
 *  @author jaime Des */

public class ListarProdutos {

	/** @param args 
	 * @throws UnsupportedAudioFileException */
	public static void main(String[] args) throws UnsupportedAudioFileException {
		ProdutoDao dao = new ProdutoDao();
		List<Produto> listProd = dao.listar();
		
//		for (Produto p: listProd) {
//			System.out.println(p.toString());
//		}
		for (int i = 0; i < listProd.size(); i++) {
			System.out.println(listProd.toString());
		}
		
		
		
		double precoTotal = listProd
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0,(t,p) -> t + p)
				.doubleValue();
		System.out.println("O Valor total de Produtos é R$ " + precoTotal);
		dao.fecharDao();
	}
}
