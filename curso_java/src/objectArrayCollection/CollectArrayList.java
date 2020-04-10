package objectArrayCollection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
/**
 * Projeto: curso_java 
 * Classe: CollectArrayList.java 
 * Criado em : 9 de abr de 2020
 * @author jaime Des */

public class CollectArrayList {

	public static void main(String[] args) {

		// Data atual
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		//System.out.println(dateFormat.format(date));
		
		System.out.println("---------------------------");
		System.out.println(" Object ");
		System.out.println("---------------------------");
		
		// Object - For
		Object obj[] = { "Pedro", 33, 89.30, dateFormat.format(date), "Sousa", "Silva",1_200_344_589_100L};
		// Percorrer um Object
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);

		}
		System.out.println("---------------------------");
		System.out.println(" Array ");
		System.out.println("---------------------------");
		
		// Array - While
		String nomes[] = { "Joao", "Felipe", "Caio", "Renato", "Fernanda" };
			int i = 0;
			while (i < nomes.length) {
				System.out.println(nomes[i]);
				i++;
			}
		System.out.println("----------------------------");
		System.out.println(" ArrayList");
		System.out.println("----------------------------");
		// List
		List<Object> lst = new ArrayList<>();
			lst.add("Joaquin"); 				//String
			lst.add(2899.89); 					//Double
			lst.add("Fernando"); 				//String
			lst.add("Rafael");					//String
			lst.add(dateFormat.format(date));	//Date
			lst.add(2_232_485_788L);            //10 9 -- 2 Bilhões
			lst.add(3_232_485_788_999_22L); 	//10¹² -- 3 Trilhões
			lst.add(1999999999); 				// Inteiro
			lst.add('c'); 						//String
			lst.add(true);      				//Boolean

		//Percorrer com While
		System.out.println("--------Loop While--------");
		int j = 0;	
		while (j < lst.size()) {
			System.out.println(lst.get(j));
			j++;
		}
		//Percorrer com ForEach
		System.out.println("--------Loop ForEach---------");
		for (Object ob : lst) {
			System.out.println(ob);
		}
	}
}
