/**
 * 
 */
package heranca;

/**
 * @author jaime Des
 * Criado em : 3 de abr de 2020
 * exercicios
 */
public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Pai p = new Pai("Jaime", 34, "Pardo","");
		Pai p1 = new Pai("José", 35, "Pardo","Analista");
		Pai p2 = new Pai("Joaquin", 34, "Caucasiano","");
		Pai p3 = new Pai("Jeremias", 34, "Negro","Gerente");
		//Filho
		Filho f = new Filho("Santiago", 13, "Caucasiano","","Jogar bola");
		Filho f1 = new Filho("Mateus", 15, "Caucasiano","","Jogar bola");
		Filho f2 = new Filho("Marcos", 15, "Pardo","","Nadar");
		Filho f3 = new Filho("Dionatan", 15, "Negro","","Lutar");
				
		
		Dao d = new Dao();
		d.insert(new Pai("Jaime", 34, "Pardo",""));
		d.insert(p1);
		d.insert(p2);
		d.insert(p3);
		d.insert(new Filho("Santiago", 13, "Caucasiano","","Jogar bola"));
		d.insert(new Filho("Mateus", 15, "Caucasiano","","Jogar bola"));
		d.insert(f2);
		d.insert(f3);
		
		d.listar();
		
		System.out.println("Deletando...");
		System.out.println("------------");
		
		d.deletar(0);
		d.deletar(1);
		d.deletar(2);
		
		//list Apos Delete
		d.listar();

	}

}
