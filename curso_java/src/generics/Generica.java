package generics;

import java.util.ArrayList;
import java.util.List;

/** Projeto: curso_java
 *  Classe: ClasseGenerica1.java
 *  Criado em : 11 de abr de 2020
 *  @author jaime Des 
 * @param <L>*/

public class Generica<T, L> {

		public T t; //Object T Especificado pelo parametro
		public int n1 = 10;
		public int n2 = 15;
		List lst = new ArrayList(); //Lista Generica
		/*
		 * Metodo vazio que executa operações internas 
		 * porem ñ recebe parametros
		 */
		public void vazio() {
			int resultado = n1 + n2;
			System.out.println("Metodo vázio que executa operações internas");
			System.out.println("O Resultado de "+ n1 +" + "+ n2 +" é :"+ resultado);
		}
		/*
		 * Metodo String que retorna uma String
		 */
		public String imprime () {
			return "Resposta Simples de uma impressão";
		}
		public Object recebe(T t) {
			return t;
		}
		/*
		 * Método que Recebe um parametro e adiciona a uma lista
		 * Retorn 
		 */
		 public void add (T t) {
			lst.add(t);
		 }
		 public List<Object> listar() {
//			 for (int i = 0; i < lst.size();i++) {
//				 //System.out.println(lst);
//			 }
			return lst;
		 }
		 public void remove (T t) {
			if(lst.contains(t)) {
				lst.remove(t);
			}else {
				System.out.println("Valor Inexistente");
			}
		 } 
/** Método que executa a Classe -------------------------------------------------------
 * 
 *   CLASSE MAIN 
 * 
****************************************************************************************/
		
		 public static void main(String[] args) {
			//Pessoas
			ObjPessoa p0 = new ObjPessoa("Fernando", 35, 89.85); //Objeto Pessoa
			ObjPessoa p1 = new ObjPessoa("Romero Jucá", 60, 79.85);
			ObjPessoa p2 = new ObjPessoa("José Alencar", 77, 90.85);
			ObjPessoa p3 = new ObjPessoa("Ulises Guimarães", 81, 75.85);
			ObjPessoa p4 = new ObjPessoa("Passos Dias", 55, 75.85);
			ObjPessoa p5 = new ObjPessoa("Romeu Zema", 50, 75.85);
			
			
			Generica g = new Generica();  //Classe Generica Instanciada
			
			g.vazio(); //Método que retorna vázio mas executa algo
			g.recebe(p0); //Metodo que recebe um ObjetoPessoa
			System.out.println(g.recebe(p0));
			System.out.println(g.imprime());
			
			
			System.out.println("\n||-----------------------||\n");
			g.add(p0);
			g.add(p1);
			g.add(p2);
			g.add(p3);
			g.add(p4);
			g.listar();
			
			System.out.println(g.listar());
			//Removendo um nome
			g.remove(p4);
			//Listando com valores Removidos
			System.out.println("\n||Object-----------------------||\n");
			System.out.println(g.listar());
			System.out.println("\n||Object-----------------------||\n");
			
			List l = new ArrayList<>();
			l.add(p5);
			l.add("Corsa");
			l.add("Palio");
			l.add("Voiage");
			l.add("Opala");
			
			System.out.println("\n" + l);
		}

}
