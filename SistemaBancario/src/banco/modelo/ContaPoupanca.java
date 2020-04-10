package banco.modelo;

import java.util.Calendar;

/*
 * Classe ContaPoupanca que herda de Conta
 * @Jaime S
 * @Projeto pós-Graduação
 */

public class ContaPoupanca extends Conta {
	
	private int aniversario;
	private double rendimento;
	
	
	//Construtor 1
	public ContaPoupanca (Cliente cl){
		super(cl);
		aniversario = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		rendimento = 0.52;
	}
	//Sacar
	@Override
	public boolean sacar (double valor){
		int hoje = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		if ((hoje > aniversario) && (saldo >= valor)){
			saldo -= valor;
			return true;
		}else {
		return false;
			}
		}
	//Aplicar rendimento
	public void aplicarRendimento (){
		if (aniversario == Calendar.getInstance().get(Calendar.DAY_OF_MONTH)){
			saldo = saldo + (saldo * rendimento / 100);
		}
	}
	
}
