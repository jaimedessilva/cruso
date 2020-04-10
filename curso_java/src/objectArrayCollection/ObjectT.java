package objectArrayCollection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**Projeto: curso_java 
 * Classe: ObjectT.java 
 * Criado em : 10 de abr de 2020
 * @author jaime Des **/

public class ObjectT {

	// Atributos
	String nome;
	int idade;
	double peso;

	// Construtor Padrão
	public ObjectT() {
		super();
	}
	
	// Construtor c Parametros
	public ObjectT(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "ObjectT \n nome: " + nome + "\n idade: " + idade + "\n peso: " + peso;
	}

	// Metodo Main que executa a Classe
	public static void main(String[] args) {

		// Data Atual
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();

		// Instancia a Própria classe
		ObjectT pessoa = new ObjectT("Ermenegildo", 35, 89.78);

		// Objeto de 9 posições
		int qtd = 10;
		Object obj[] = new Object[qtd]; // Posições
			obj[0] = "Soraya"; // String
			obj[1] = 1012000000; // int
			obj[2] = 2_222_123_456_789L; // Long
			obj[3] = 2899.89d; // Double
			obj[4] = 1222.57f; // Float
			obj[5] = 'c'; // float
			obj[6] = true; // Bolean
			obj[7] = "Caio Silva"; // String
			obj[8] = dateFormat.format(date);// Date
			obj[9] = pessoa; // Objeto Pessoa

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}

		System.out.println("---------------------------------");
		System.out.println("Declaração Simplificada de Objeto");
		System.out.println("---------------------------------");
		
		// Object Array Simplificado
		Object obj1[] = { "Matheus", "Marcos", true, 28.99, 111, 'a' };

			for (Object lst : obj1) {
				System.out.println(lst);
			}

	}

}
