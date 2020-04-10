/**
 * 
 */
package heranca;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jaime Des Criado em : 3 de abr de 2020 exercicios
 */
public class Dao {
	// ArrayList do Tipo Obj
	List<Pai> list = new ArrayList<Pai>();

	// Add
	void insert(Pai p) {
		list.add(p);
	}

	// List
	void listar() {
		int i = 0;
		while (i < list.size()) {
			System.out.println("--------------------");
			System.out.println(list.get(i).toString());
			i++;
		}
	}

	// Delete
	void deletar(int id) {
		try {
			list.remove(id);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}