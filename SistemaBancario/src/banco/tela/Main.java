package banco.tela;

import javax.swing.JOptionPane;

import banco.modelo.Cliente;
import banco.modelo.Conta;
import banco.modelo.ContaCorrente;
import banco.modelo.ContaPoupanca;
import banco.modelo.PessoaFisica;
import banco.modelo.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		
		String tipoCliente = JOptionPane.showInputDialog(null,
				"Tipo Cliente \n"+
				"1 - Pessoa Física \n"+
				"2 - Pessoa Jurídica \n");
		//PF 
		PessoaFisica pf = new PessoaFisica();
		//PJ
		PessoaJuridica pj = new PessoaJuridica();
		
		if (tipoCliente.equalsIgnoreCase("1")){
			
			
			pf.setNome("jaime");
			pf.setCpf("0111222333");
			pf.setCidade("Brasilia");
			pf.setEstado("DF");
			
			JOptionPane.showMessageDialog(null, pf.listaDados());
		
		}else if (tipoCliente.equalsIgnoreCase("2")) {
		  
		   pj.setRazaoSocial("Conpanhia LTDA");
		   pj.setCnpj("0153333666999");
		   pj.setCidade("Brasilia");
		   pj.setEstado("DF");
		   
		   JOptionPane.showMessageDialog(null, pj.listarDados());
		}else {
			JOptionPane.showMessageDialog(null, "Opção Invalida");
		}
		String tipoConta = JOptionPane.showInputDialog(null, "Tipo de Conta: \n"+
		"1 - Conta Corrente \n"+
		"2 - Conta Poupança \n");
		
		if (tipoConta.equalsIgnoreCase("1")){
			
			ContaCorrente cc = new ContaCorrente(pf);
			cc.depositar(500);
			JOptionPane.showMessageDialog(null, cc.listarDados());
		}else if (tipoConta.equalsIgnoreCase("2")){
			
			ContaPoupanca cp = new ContaPoupanca(pf);
			cp.sacar(100);
		}
	}
}
