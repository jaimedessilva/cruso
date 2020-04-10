package banco.tela;

import java.util.Arrays;
import javax.swing.JOptionPane;
import banco.modelo.Cliente;

/*
 *Implementação de Um menu para incluir dados 
 *
 */

public class Colecoes {

	public static void main(String[] args) {
			//Menu
			String opcao = JOptionPane.showInputDialog(null,
					"Escolha uma das seguintes opções: \n"+
					"1 - Incluir Dado \n "
					+ "2 - Listar Dados \n "
					+ "3 - Excluir Dados");
			if (opcao.equals("1")){
				JOptionPane.showMessageDialog(null, "Incluir Dados");
			}else if (opcao.equals("2")){
				JOptionPane.showMessageDialog(null, "Listar Dados");
			}else if (opcao.equals("3")){
				JOptionPane.showMessageDialog(null, "Excluir Registro");
			}else {
				JOptionPane.showMessageDialog(null, "Opção Invalida, Finalizando o programa...");
				return;
			}
			
			
			
	}//End Class

}
