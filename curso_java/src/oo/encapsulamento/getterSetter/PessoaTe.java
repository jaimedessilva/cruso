/**
 * 
 */
package oo.encapsulamento.getterSetter;

/**
 * @author jaime Des
 * Criado em : 3 de abr de 2020
 * exercicios
 */
public class PessoaTe {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pessoa p = new Pessoa(-45);
		p.setIdade(230);		
		System.out.println(p.getIdade());
	}

}
