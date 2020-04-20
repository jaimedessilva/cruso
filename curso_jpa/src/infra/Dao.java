package infra;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.sound.sampled.UnsupportedAudioFileException;
/** curso_jpa 
 *  Dao.java 
 *  Criado em : 9 de abr de 2020
 *  @author jaime Des */

//Classe Dao generica
public class Dao<E> {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	private Class<E> classe;

	// Connection Database
	static {
		try {
			//Persistence.xml
			emf = Persistence.createEntityManagerFactory("curso_jpa");
		} catch (Exception e) {
			// logar -> log4j
		}
	}
	// Construct
	public Dao() {
		this(null);
	}

	// Construct Method Fields
	public Dao(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}

	// Metodo Begin Trasaction
	public Dao<E> abrirT() {
		em.getTransaction().begin();
		return this;
	}

	// Metodo Commit Transaction
	public Dao<E> fechatT() {
		em.getTransaction().commit();
		return this;
	}

	// Metodo Persist
	public Dao<E> inserir(E entidade) {
		em.persist(entidade);
		return this;
	}

	// Metodo Persist Atomico
	public Dao<E> inserirAtomico(E entidade) {
		em.persist(entidade);
		return this.abrirT().fechatT();
	}

	// Metodo Listar
	public List<E> listar(int qtd, int deslocamento) throws UnsupportedAudioFileException {
		// Verifica se objeto não veio Nulo
		if (classe == null) {
			throw new UnsupportedAudioFileException("Classe nula");
		}
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtd);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	// Metodo Listar
	public List<E> listar() throws UnsupportedAudioFileException {
			// Verifica se objeto não veio Nulo
			if (classe == null) {
				throw new UnsupportedAudioFileException("Classe nula");
			}
			String jpql = "select e from " + classe.getName() + " e";
			TypedQuery<E> query = em.createQuery(jpql, classe);
			//query.setMaxResults(qtd);
			//query.setFirstResult(deslocamento);
			return query.getResultList();
		}
	//Metodo Obter por ID
	public E getById (Object id) {
		return em.find(classe, id);
	}
	// Fechar Dao
	public void fecharDao() {
		em.close();
	}

}// End
