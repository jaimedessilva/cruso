/**
 * 
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jaime Des
 * Criado em : 31 de mar de 2020
 * exercicios
 */
public class PessoaDao {
	
	
	//ArrayList de Objetos
	List<Pessoa> lst = new ArrayList<>();
	Pessoa p;

	//Inser o objeto na lista
	void include(Pessoa ps) {
		this.p = ps;
		lst.add(ps);
		//System.out.println("Dados inseridos com Sucesso!!!");
//		System.out.println("------------------------------");
//		System.out.println(ps.getObj());
	}
	void listObj() {
		//Itera os Dados da Lista
		int i = 0;
		while (i < lst.size()) {
			System.out.println(lst.get(i).getObj());
			i++;
		}
	}
	void del (int id) {
		lst.remove(id);
		System.out.println("..................");
		System.out.println("--REMOVIDO ID:" + id);
		System.out.println("..................");
	}
}