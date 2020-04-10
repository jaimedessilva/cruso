package generics;

/** Projeto: curso_java
 *  Classe: CaixaObjT.java
 *  Criado em : 10 de abr de 2020
 *  @author jaime Des */

public class CaixaObjT {

	public static void main(String[] args) {
		//Tipo Double
		CaixaObjeto<Double> obj = new CaixaObjeto();
		obj.setObj(22.10);
		System.out.println(obj.getObj());
		
		//Tipo String
		CaixaObjeto<String> obj1 = new CaixaObjeto();
		obj1.setObj("Vinte dois e Dez");
		System.out.println(obj1.getObj());
	
		//Inteiro
		CaixaObjeto<Integer> obj3 = new CaixaObjeto();
		obj3.setObj(2210);
		System.out.println(obj3.getObj());
		
		//Tipo mais Generico
		CaixaObjeto obj4 = new CaixaObjeto();
		obj4.setObj(1_222_356_331_00L);
//		obj4.setObj("Nome de Alguem");
//		obj4.setObj(22.10);
		System.out.println(obj4.getObj());
	
	
	}
	
	
}
		
