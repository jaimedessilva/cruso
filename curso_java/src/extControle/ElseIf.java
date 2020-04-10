package extControle;

import javax.swing.JOptionPane;
//Cod que verifica se um numero é Par ou Impar
public class ElseIf {
    
	public static void main(String[] args) {
		//variaveis
		String m = "Informe o Numero:";
		String valor; 
		
		valor = JOptionPane.showInputDialog(m);
		int num = Integer.parseInt(valor);
		
		if (num % 2 == 0) {
			System.out.println("Numero Par!");
		}else {
			System.out.println("Numero Inpar");
		}
	}
}
