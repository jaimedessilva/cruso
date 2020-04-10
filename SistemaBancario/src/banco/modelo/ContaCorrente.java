package banco.modelo;

import java.text.DecimalFormat;

/*
 * Classe ContaCorrente que herda de Conta
 * @Jaime S
 * @Projeto Pós-Graduação
 */

public class ContaCorrente extends Conta {
	
	private double limite;
	private double juros;
	private double saldo;
	
	//Construtor
	public ContaCorrente(Cliente cl) {
		super(cl);
		limite = 1000;
		juros = 5.9;
		saldo = super.saldo;
	}
	//Sacar
	@Override
	public boolean sacar (double valor){
			double limiteTotal;	
			if (valor <= saldo + limite){
				saldo = saldo - valor;
				return true;
			}else {
				//JOptionPane.showMessageDialog(null, "Valor acima do permitido");
				return false;
			}
	}
	//Depositar
	@Override
	public void depositar (double valor){
		saldo = saldo + valor;	
	}
	//Listar Dados
	@Override
	public String listarDados(){		
		String nome;
		
		if (cliente instanceof PessoaFisica){
			nome = ((PessoaFisica)cliente).getNome();
		}else {
			nome = ((PessoaJuridica)cliente).getRazaoSocial();
		}
		return "CONTA: "+ numero + "\n"+
		"CORRENTISTA: "+ nome + "\n"+
		"SALDO: "+ DecimalFormat.getCurrencyInstance().format(saldo)+"\n"+
		"SALDO COM LIMITE: " + DecimalFormat.getCurrencyInstance().format(saldo + limite);	
	}
	//Aplicar Juros
	public void aplicarJuros (){
		if (saldo < 0){
			saldo = saldo - ( saldo * juros);
		}
	}
}
