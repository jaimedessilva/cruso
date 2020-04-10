package fundamentos;

import javax.swing.JOptionPane;

public class TexteMenu {

	public static void main(String[] args) {
		//Variaveis
				var m = "Bem Vindo ao Game, Escolha uma opção";		
				var li =" \n 1 - JOGAR \n "
						+ "2 - VER JOGADORES \n "
						+ "3 - VER RECORDS \n "
						+ "4 - SAIR";
				//String r = null;
				
				
				JOptionPane.showMessageDialog(null, m);
				String r = JOptionPane.showInputDialog("Escolha uma das opções:"+li);
				int r2 = Integer.parseInt(r);//Converte para int
				
				
				
				while (r2 != 4) {
					//Enquanto for != 4 Repete a pergunta
					//JOptionPane.showInputDialog("Escolha uma das opções:"+li);
					//System.out.println("banana");
					System.out.println(r2);
					r2++;
				}
					/*if (r2 == 1) {
						//JOptionPane.showMessageDialog(null, "Você escolheu: JOGAR");
						System.out.println(r2);
					}
					else {
						JOptionPane.showMessageDialog(null, "Você escolheu: SAIR");
					}	
					/*else if (r2 == 2) {
						JOptionPane.showMessageDialog(null, "Você escolheu: VER JOGADORES");
						break;
					}else if (r2 == 3) {
						JOptionPane.showMessageDialog(null, "Você escolheu: VER RECORDS");
					}*/
				

	}
}
