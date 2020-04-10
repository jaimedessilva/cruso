package generics;

/** Projeto: curso_java
 *  Classe: CaixaObjeto.java
 *  Criado em : 10 de abr de 2020
 *  @author jaime Des */

/* Classe do tipo Generics que recebe qualquer Objeto
* Define que pode receber qualquer objeto especificando ou não o tipo*/
public class CaixaObjeto<Obj> {
	private Obj obj;

	public Object getObj() {
		return obj;
	}
	public void setObj(Obj obj) {
		this.obj = obj;
	}
	//Metodo que executa
	public static void main(String[] args) {
		
	}
}
