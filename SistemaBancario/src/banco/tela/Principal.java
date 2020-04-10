package banco.tela;

import javax.swing.JOptionPane;
import banco.modelo.Agencia;
import banco.modelo.Cliente;
import banco.modelo.Conta;
import banco.modelo.ContaCorrente;
import banco.modelo.ContaPoupanca;
import banco.modelo.PessoaFisica;
import banco.modelo.PessoaJuridica;


/*
 * Calsse Principal que executa a Aplica��o Sistema Bancario
 * @Jaime S
 * @Projeto P�s-Gradua��o
 * 
 */
public class Principal {

	public static void main(String[] args) {

		//Agencia
		Agencia ag = new Agencia (1,"São Paulo - Centro"); 
		String opcaoPrincipal = "";
		  
		  //Menu Agencia com laço Do While
		  do {
			  opcaoPrincipal = JOptionPane.showInputDialog(null,"Cadastro de Contas para Agencia"
					  + ag.getNumero()+ "-" + ag.getNome()+ "\n"
					  + "\n OPÇÔES \n"
					  + "1- Incluir Cliente e Conta \n"
					  + "2 - Listar Contas Cadastradas \n"
					  + "3 - Sair do Sistema");
		  
			    if (opcaoPrincipal.equals("1")){
				 
				// Cliente
				Cliente cl = new Cliente();
				// String tipo Cliente
				String tipoCliente = JOptionPane.showInputDialog(null,
						"Escolha o tipo de cliente: \n " + "PF - Pessoa Fisica \n" + "PJ - Pessoa Juridica \n");
		
				// IF
				if (tipoCliente.equalsIgnoreCase("PF")) {
					cl = new PessoaFisica();
					((PessoaFisica) cl).setNome(JOptionPane.showInputDialog(null, "Nome do Cliente: "));
					((PessoaFisica) cl).setCpf(JOptionPane.showInputDialog(null, "CPF do Cliente: "));
				} else if (tipoCliente.equalsIgnoreCase("PJ")) {
					cl = new PessoaJuridica();
					((PessoaJuridica) cl).setRazaoSocial(JOptionPane.showInputDialog(null, "Razão Social"));
					((PessoaJuridica) cl).setCnpj(JOptionPane.showInputDialog(null, "Cadastro de Pessoa Juridica (CNPJ): "));
				} else {
					JOptionPane.showMessageDialog(null, "Opção Invalida, encerrando o programa....");
					return;
				} // End If
		
				cl.setCidade(JOptionPane.showInputDialog(null, "Cidade onde o cliente reside: "));
				cl.setEstado(JOptionPane.showInputDialog(null, "Estado que o cliente reside: "));
		
				JOptionPane.showMessageDialog(null, "Dados do Cliente \n\n" + cl.listarDados());
				// Obj Conta
				Conta c;
				// Menu Tipo Conta
				String tipoConta = JOptionPane.showInputDialog(null,
						"Tipo de conta \n" + "1 - Conta Corrente " + "\n" + "2- Conta Poupança ");
				// If
				if (tipoConta.equalsIgnoreCase("1")) {
					c = new ContaCorrente(cl);
				} else {
					c = new ContaPoupanca(cl);
				} // End IF
				ag.incluirConta(c);
				JOptionPane.showMessageDialog(null, "DADOS DA CONTA \n\n"+
				            c.listarDados());
		
		// Menu da Conta ------------------------------------------------------------------------------------||
		int opcao = 0;
		String valor = "";
		do {
			String msg = "Conta Cliente: \n" + c.listarDados() + "\n\n" + "OP��ES: \n " + "1 - Depositar \n "
					+ "2 - Sacar \n " + "3 - Finalizar";
			// Try
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, msg));

				// Switch Case
				switch (opcao) {

				case 1:
					valor = JOptionPane.showInputDialog(null, "Valor do Deposito:");
					c.depositar(Double.parseDouble(valor));
					JOptionPane.showMessageDialog(null, "Deposito realizado");
					break;
				case 2:
					valor = JOptionPane.showInputDialog(null, "Valor do Saque:");
					if (c.sacar(Double.parseDouble(valor))) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
					} else {
						JOptionPane.showMessageDialog(null, "Saque n�o realizado - Por favor tente mais tarde");
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "N�o foi possivel efetuar a opera��o, valor invalido: " + e);
			}
		} while ((opcao == 1) || (opcao == 2));
  
			    }else if (opcaoPrincipal.equals("2")){ 
	  
	  if (ag.getContas().size() == 0){
		  	JOptionPane.showMessageDialog(null, "N�o h� contas cadastradas"); 
	}else {
			JOptionPane.showMessageDialog(null, "A Agencia" +
                   ag.getNumero()+"-"+ag.getNome()+ "Possui " +ag.getContas().size()
                   +" Contas (s). \n \n "
                   + "Veja quais s�o nas proximas telas");
			for (Conta umaConta : ag.getContas()){
                 JOptionPane.showMessageDialog(null, umaConta.listarDados()); 
                 } 
			} 
	  }
 }while((opcaoPrincipal.equals("1"))||(opcaoPrincipal.equals("2"))); 
		  } 
	}// End Class
 
