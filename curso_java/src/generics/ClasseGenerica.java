package generics;

/** Projeto: curso_java
 *  Classe: ClasseGenerica.java
 *  Criado em : 11 de abr de 2020
 *  @author jaime Des */

public class ClasseGenerica {
	
	
	public Object recebe (Object obj) {
		return obj;
	}
	
	public static void main(String[] args) {
		
		ObjPessoa p = new ObjPessoa("Fernando", 35, 89.85);
		ObjCarro c = new ObjCarro("Camaro","Vermelho",5.1);
		
		ClasseGenerica gen = new ClasseGenerica();
		gen.recebe(p);
        	
		System.out.println(gen.recebe(p));	
		System.out.println(gen.recebe(c));
	}

}
