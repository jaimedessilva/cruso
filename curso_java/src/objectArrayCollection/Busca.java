/**
 * 
 */
package objectArrayCollection;

/**
 * @author jaime Des
 * Criado em : 30 de mar de 2020
 * exercicios
 */
public class Busca {
	public static void main(String[] args) {
		
		//Percorre um array com While
		String nomes[] = {"jaime","Pedro","Lucas","Joao","Maria"};
		
		int i = 0;
		while (i < nomes.length) {
			System.out.println("Id:" + i + "-" + nomes[i]);
			i++;
		}
		//Insere novo valor na Array no indice 1
		nomes[1] = "Sebastiao";
		int x = 0;
		while (x < nomes.length) {
			System.out.println("Id:" + x + "-" + nomes[x]);
			x++;
		}
	}

}
