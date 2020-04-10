package banco.modelo;

/*
 * Classe PessoaFisica que herda de Cliente
 * @Jaime S
 * @Projeto Pós-Graduação
 * 
 */
public class PessoaFisica extends Cliente {
	
	private String nome;
	private String cpf;
	
	//Construtor
	public PessoaFisica (){
		super();
		nome = "Indefinido";
		cpf = "";
	}
	//Construtor com parametros
	public PessoaFisica(String cidade, String estado, String nome, String cpf){
		super (cidade, estado);
		this.nome = nome;
		this.cpf = cpf;
	}
	//Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//Listar Dados
	public String listaDados(){
		return "NOME: "+nome+"\n"+
				"CPF: "+cpf+"\n"+
				super.listarDados();
	}
}
