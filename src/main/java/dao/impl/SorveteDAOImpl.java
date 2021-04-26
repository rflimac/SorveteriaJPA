package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import dao.SorveteDAO;
import entidade.Sorvete;
import util.JpaUtil;

public class SorveteDAOImpl implements SorveteDAO {
	private EntityManager em;
	private EntityTransaction et;

	@Override
	public void adicionarSorvete(Sorvete sorvete) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(sorvete);
			et.commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transaçao");
		} finally {
			if (em.isOpen())
				;
			{
				em.close();
			}
		}
	}

	@Override
	public void removerSorvete(String nomeRemove) {

		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.remove(em.find(Sorvete.class, nomeRemove));
			et.commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transaçao");
		} finally {
			if (em.isOpen())
				;
			{
				em.close();
			}
		}

	}

	@Override
	public List<Sorvete> listarSorvete() {
		this.em = JpaUtil.getEntityManager();
		Query query = em.createQuery("from Sorvete e");
		List<Sorvete> listarSorvete = query.getResultList();
		em.close();
		return listarSorvete;

	}

	

}
