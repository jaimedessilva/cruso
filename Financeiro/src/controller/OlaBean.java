package controller;

public class OlaBean {
	
	private String nome;
	private String Sobrenome;
	private String nomeCompleto;
	
	public void dizerOla (){
		this.nomeCompleto = this.nome.toUpperCase()+""+ this.Sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
}
