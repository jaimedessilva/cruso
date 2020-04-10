/**
 * 
 */
package classes;

/**
 * @author jaime Des
 * Criado em : 30 de mar de 2020
 * exercicios
 */
public class Usuario {
	String nome;
	String email;

  public boolean equals(Object obj) {
	  //Cast de Objeto
	  Usuario us = (Usuario) obj;
	  
	  boolean nomeIgual = us.nome.equals(this.nome);
	  boolean emailIgual = us.email.equals(this.email); 
	  return nomeIgual && emailIgual;
  }
}