/**
 * 
 */
package exceptionError;

/**
 * @author jaime Des
 * Criado em : 6 de abr de 2020
 * exercicios
 */
@SuppressWarnings("serial")
public class NegativoException extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public NegativoException (String nomeAt) {
		this.nomeDoAtributo = nomeAt;
	}
	public String getMessage1() {
		return String.format("O Atributo %s está negativo", nomeDoAtributo);
	}
	public String getMessage() {
		return String.format("O Atributo %s está vazio", nomeDoAtributo);
	}
}
