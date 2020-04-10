/**
 * 
 */
package exceptionError;

import classes.Aluno;

/**
 * @author jaime Des
 * Criado em : 6 de abr de 2020
 * exercicios
 */
public class Validar {
	private void validar() {}
	
	public static void aluno (Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("O Aluno está nulo");
		}
		if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
			 
		}
	}
	
}
