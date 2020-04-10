/**
 * 
 */
package classes;

/**
 * @author jaime Des
 * Criado em : 30 de mar de 2020
 * exercicios
 */
public class A {
	
	int atual = 2020;
	int nasc = 1952;
	
	int idade() {
		
		int idade = atual - nasc;
		return idade;
	}
	public static void main(String[] args) {
		A idade = new A();
		System.out.println(idade.idade());
	}

}