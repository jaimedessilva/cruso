package classes;

public class ProdutoTexte {

	public static void main(String[] args) {
		
		//Variavaeis
		String n,s = "";
		double a,b,r;
		
		//s = System.out.println();
		
		//Instanciando objetos
		Produto p1 = new Produto();
		n = p1.nome = "notebook";
		a = p1.preco = 2000.89;
		b = p1.desconto = 0.10;
		r = p1.precoComDesc();
		
		
		//Instancia de uma unica linha
		Produto p = new Produto("Celular",699.89,0.15);
		
		
		/*System.out.println(n);
		System.out.println(a);
		System.out.println(r);*/
		System.out.println("Produto:"+
		p.nome +"\n"+ 
		p.preco +"\n"+ 
		p.desconto);
		
		
	}

}
