package fundamentos;
/*
 * Inferencia permite que vc use variáveis sem a tipagem 
 * mais pelo valor inserido a linguagem automaticamente subtende o tipo
 * ex: Antes: String nome = "jaime" Agora var nome = "jaime"
 */
public class Inferencia {
	public static void main(String[] args) {
		
		//Tipando variaveis com a palavra VAR 
		var b = 5.0;
		System.out.println(b);
		var c = 5.1;
		System.out.println(c);
		var d = "texto";
		System.out.println(d);
		d = "outra coisa";
		System.out.println(d);
		
	var nome = "jaime";
	var email ="jaime@gmail.com";
	var idade = 33;
	var peso = 79.80;
	System.out.println(nome+"-"+email+"-"+idade+"-"+peso);
		
	}

}
