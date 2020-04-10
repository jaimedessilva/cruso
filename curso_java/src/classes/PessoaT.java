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
public class PessoaT {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		//Instancia pessoas
		Pessoa p1 = new Pessoa("Jaime",1.76,82.0,1986);
		Pessoa p2 = new Pessoa("Carlos",1.77,77.0,1981);
		Pessoa p3 = new Pessoa("Caio",1.80,81.0,1983);
		Pessoa p4 = new Pessoa("Pedro",1.78,80.0,1979);
		
//		//Cria uma lista de objetos
//		ArrayList<Pessoa> l = new ArrayList<Pessoa>();
//		
//		l.add(p1);
//		l.add(p2);
//		l.add(p3);
//		l.add(p4);
		
		PessoaDao dao = new PessoaDao();
		
		dao.include(p1);
		dao.include(p2);
		dao.include(p3);
		dao.include(p4);
		
		dao.listObj();
		
		dao.del(1);
		dao.del(2);
		
		dao.listObj();
		
		
//		int i = 0;
//		while (i < l.size()) {
//			//Imprime dados obtidos
//			System.out.println(l.get(i).getObj());
//			i++;
//		}
		
//		
//		PessoaCrud crud = new PessoaCrud();
//		
//		//Crud
//		crud.insert(p1);
//		crud.insert(p2);
//		crud.insert(p3);
//		crud.insert(p4);
//		
		//System.out.println(crud.listar());
		//System.out.println(crud.insert(p1));
	
	}
}
