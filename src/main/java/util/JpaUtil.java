package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("PROJETOMV");
	}
	
	/**
	 * Metodo responsavel por retornar um entityManager
	 *@return EntityManager
	 */
	public EntityManager getEntityManager() {
		return factory.createEntityManager();
		
	}
	
	public void closeEntityManager() {
		factory.close();
	}
}
