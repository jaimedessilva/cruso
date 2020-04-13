package teste.jpa;

import java.util.ArrayList;
import java.util.List;

/** Projeto: curso_jpa
 *  Classe: Generica.java
 *  Criado em : 12 de abr de 2020
 *  @author jaime Des 
 * @param <E>*/

public class Generica<T> {
		
	private T t;
	
	//Recebe o Param 
	public void set(T t) {
		this.t = t;
	}
	//Envia o retorno
	public T get() {
		return t;
	}
	@Override
	public String toString() {
		return "Generica : " + get();
	}	
			 	
	public static void main(String[] args) {
		
		//Set String
		Generica<String>g1 = new Generica<String>();
		g1.set("Salgado");
		System.out.println(g1);
		
		//Set Integer
		Generica<Integer>g2 = new Generica<>();
		g2.set(100);
		System.out.println(g2);
		
		//Set Double
		Generica<Double>g3 = new Generica<>();
		g3.set(200.99);
		System.out.println(g3);
		//Object Array
		Object obj[]= {"Roberto",33,89.91,"roberto@gmail.com"};
		
		//Object
		Generica<Object[]>g4 = new Generica<>();
		g4.set(obj);
		System.out.println(g4.get());
		
		for (Object ob : g4.get()) {
			System.out.println(ob);
		}
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
		
		
	 		
	 	
	 	
}
