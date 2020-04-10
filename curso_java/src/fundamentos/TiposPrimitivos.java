package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Tipos numeros inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos Booleanos
		boolean estaDeFerias = false; //true
		
		// Tipos caracters
		
		char status = 'A'; //Ativo
		
		// Dias de Empresa
		
		System.out.println("Dias de Empresa:" +anosDeEmpresa * 365);
		System.out.println("Nº de voos:" + numeroDeVoos /2);
		System.out.println("Total de pontos:" + pontosAcumulados / vendasAcumuladas);
		System.out.println("Funcionario Nº " + id+ " - ganha ->"+ salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: "+ status);
	}

}
