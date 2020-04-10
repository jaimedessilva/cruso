package banco.modelo;

import java.util.ArrayList;
import java.util.List;

/*
* Classe agencia que recebe as contas
* @Jaime S
*/

public class Agencia {

	private int numero;
	private String nome;
	private List<Conta> contas;

	// Construtor
	public Agencia(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		contas = new ArrayList<>();
	}

	// Get
	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	// Adicionar
	public void incluirConta(Conta c) {
		contas.add(c);
	}

	// Remover
	public void excluirConta(Conta c) {
		contas.remove(c);
	}
}
