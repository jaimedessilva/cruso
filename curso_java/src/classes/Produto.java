package classes;
/**
 * @author jaime Des
 */
public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto(){
		
	}
	
	Produto(String nome, Double preco, Double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	double precoComDesc() {
		double result = preco - preco * desconto;
		return result;
	}
}
