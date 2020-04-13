package teste.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

/** Projeto: app_crud_desk
 *  Classe: EPessoa.java
 *  Criado em : 12 de abr de 2020
 *  @author jaime Des */

@Entity
@Table (name="t_pessoa")
public class EPessoa implements Serializable {
	/**/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String email;
	
	public EPessoa () {
		
	}
	//Construct
	public EPessoa(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	@Override
	public String toString() {
		return "EPessoa\n id: " + id + "\n nome: " + nome + "\n email: " + email;
	}
	//Inicia a Aplicação
	public static void main(String[] args) {
		
		EPessoa p = new EPessoa();
		EPessoa p1 = new EPessoa(null,"Maíra Lemos","maira@gmail.com");
		EPessoa p2 = new EPessoa(null,"Carlos Silva","csilva@gmail.com");
		EPessoa p3 = new EPessoa(null,"Sebastiao Salgado","salgado@gmail.com");
		EPessoa p4 = new EPessoa(null,"Maria DB","mariadb@gmail.com");
		EPessoa p5 = new EPessoa(null,"Homer Simpson","homer@gmail.com");
		
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
		
		//Chamando e instanciando Conexão
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso_jpa");
		EntityManager em = emf.createEntityManager();
		
		//Persistir Obj no DB
		
//		
//		em.getTransaction().begin(); //Begin Transaction
//			em.persist(p1);
//			em.persist(p2);
//			em.persist(p3);
//			em.persist(p4);
//			em.persist(p5);
//		em.getTransaction().commit(); //End Transaction
//		

		//Busca 
		//p = em.find(EPessoa.class,5);
		System.out.println(p);
		
		//Remover
//		p = em.find(EPessoa.class,4);
//		em.getTransaction().begin();
//			em.remove(p);
//		em.getTransaction().commit();
//
//		System.out.println("Removida pessoa"+ p + "!!!!");
		
		em.close();
		emf.close();
	}
	
	
	
}
