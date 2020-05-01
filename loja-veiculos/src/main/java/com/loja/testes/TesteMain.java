package com.loja.testes;

import java.util.List;

import com.loja.dominio.Proprietario;
import com.loja.dominio.Veiculo;

/** Projeto: loja-veiculos
 *  Classe: TesteMain.java
 *  Criado em : 1 de mai de 2020
 *  @author jaime Des */

public class TesteMain {

	/** @param args */
	public static void main(String[] args) {
//		DaoImp<Veiculo> dao = new DaoImp<Veiculo>(Veiculo.class);
//		Object car = dao.getById(14L);
//		System.out.println(car);
			
		DaoImp<Proprietario> d = new DaoImp<>(Proprietario.class);
//		List<Proprietario> lst = d.getAll();
//		for (Proprietario p : lst) {
//			System.out.println(p);
		
		List<Proprietario> listProp = d.findByName("roberto");
		for (Object obj : listProp) {
			System.out.println(obj.toString());
		
		
		}
		
		
		
		
	}

}
