/**
 * 
 */
package executa;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import dao.Dao;
import model.Usuario;

/**
 * @author jaime Des Criado em : 7 de abr de 2020 exercicios Menu de Opções do
 *         CRUD
 */
public class Principal {

	public static void main(String[] args) throws SQLException {

		// Lista de Opções
		Object[] itens = { "Cadastrar", "Alterar", "Deletar", "Listar", "Sair" };

		// JOptionsPane
		Object valor = JOptionPane.showInputDialog(null, "Escolha uma opção", "Opção", JOptionPane.INFORMATION_MESSAGE,
				null, itens, itens[3]);

		Usuario u = new Usuario();// Classe Usuario
		Dao dao = new Dao();// Classe de Persistencia

		if (valor.equals("Cadastrar")) { // Cadastrar

			u.nome = JOptionPane.showInputDialog("Digite o seu Nome: ");
			u.email = JOptionPane.showInputDialog("Digite o Email");
			u.telefone = JOptionPane.showInputDialog("Telefone");

			if (!(u.nome.isEmpty()) && !(u.email.isEmpty())) {// Campos ñ podem ser vazios
				dao.inserir(u);
			} else {

				System.out.println("Não foi possivel Efetuar o cadastro");
			}

		} else if (valor.equals("Alterar")) {// Alterar

			u.nome = JOptionPane.showInputDialog("Digite o seu Nome: ");
			u.email = JOptionPane.showInputDialog("Digite o Email");
			u.telefone = JOptionPane.showInputDialog("Telefone");
			String id = JOptionPane.showInputDialog("Digite o codigo que deseja dlterar: ");
			u.id = Long.parseLong(id);// Convert String p Int

			int a = JOptionPane.showConfirmDialog(null, "Voce tem certeza que deseja alterar esse Registro ???");
			if (a == 0) {
				if (!(u.nome.isEmpty()) && !(u.email.isEmpty())) {
					dao.alterar(u);
				}
			} else {

				System.out.println("Sair...");
			}

		} else if (valor.equals("Deletar")) {// Deletar

			String id = JOptionPane.showInputDialog("Digite Codigo que Deseja Excluir: ");
			u.id = Long.parseLong(id);// Convert String p Int
			int a = JOptionPane.showConfirmDialog(null, 
					"Voce tem certeza que deseja excluir esse Registro ???");
			if (a == 0) {

				if (u.id >= 0) {// Não aceita n menores que 0
					dao.deletar(u);
				} else {
					System.out.println("Não foi POssivel realizar essa operação");
				}
			} else {

				System.out.println("Sair...");
			}
		} else if (valor.equals("Listar")) {// Listar Dados

			System.out.println("----------------------------");
			System.out.println("---------Registros----------");
			System.out.println("----------------------------");
			dao.getLista();
			System.out.println("----------------------------");

		} else { // Sair do Programa

			System.out.println("sair");

		}
	}
}
