/**
 * 
 */
package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

/**
 * @author jaime Des
 * Criado em : 3 de abr de 2020
 * exercicios
 */
public class Pedro extends Ana {
	Ana mae = new Ana();
	
	void testeAcessos() {
		//Atributos da Classe Ana
		
//		segredo 
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
		
		//System.out.println(mae.segredo);
		//System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);

   }
}
