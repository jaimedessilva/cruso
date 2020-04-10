package banco.modelo;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
/*
 * Classe Conta que recebe o objeto cliente
 * @Jaime S
 * @Projeto Pós-Graduação
 * 
 */
public class Conta {
	// Atrib
	protected int numero;
	protected Cliente cliente;
	protected double saldo;
	//Contador
	private static int contador;
	
	Random r = new Random();
    public String msg = "Saldo Insulficiente para saque";

	// Construtor que recebe obj Cliente cl
	public Conta(Cliente cl) {
		this.cliente = cl;
		saldo = 5000;
		numero = r.nextInt();
	}

	// Getters-Setteres
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	//Depositar
	public void depositar (double valor){
			this.saldo += valor;
	}
	//Sacar
	public boolean sacar (double valor){
		if (valor <= saldo){
			this.saldo -= valor;
			return true;
		}else {
			JOptionPane.showMessageDialog(null,msg);
			return false;
		}
	}
	//Listar Cliente e Saldo
	public String listarDados (){
		//Formata saldo para o formato monetario
        //DecimalFormat.getCurrencyInstance().format(saldo);
		String nome;
		if (cliente instanceof PessoaFisica){
			nome = ((PessoaFisica)cliente).getNome();
		}else {
			nome = ((PessoaJuridica)cliente).getRazaoSocial();  
		}
		return  
				"||Cidade-UF: "+cliente.getCidade()+"/"+
				                cliente.getEstado()+" ||\n"+
	            "||Conta: "+this.numero+" ||\n"+ 
				"||Seu Saldo atual é de: R$ " +DecimalFormat.getCurrencyInstance().format(saldo)+" ||";
	}
}// End
