package banco.modelo;

/*
 * Classe PessoaJuridica que herda de Cliente
 * @Jaime S
 * @Projeto Pós-Graduação
 * 
 */
public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String razaoSocial;
	
	//Construct
	public PessoaJuridica(){
		super();
		cnpj = "";
		razaoSocial = "INDEFINIDA";
	}
	//Construct
	public PessoaJuridica (String cidade, String estado, String cnpj, String razaoSocial){
		super (cidade, estado);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	//Get Set
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	//List
	public String listarDados(){
		return "RAZÃO SOCIAL: "+razaoSocial+"\n"+
				"CNPJ: "+cnpj+"\n"+
				super.listarDados();
	}
}
