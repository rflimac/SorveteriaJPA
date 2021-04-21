package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.SorveteDAO;
import entidade.Sorvete;
import util.JpaUtil;

public class ControleDAOImpl implements SorveteDAO {

	@Override
	public void adicionarSorvete(Sorvete sabor) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction ts = ent.getTransaction();
		ts.begin();

		ent.persist(sabor);

		ts.commit();
		ent.close();
	}

	@Override
	public void removerSorvete(Sorvete sabor) {
		EntityManager ent = JpaUtil.getEntityManager();
		Sorvete sorvete = ent.find(Sorvete.class, sabor);
		try {
			ent.getTransaction().begin();
			ent.remove(sorvete);
			ent.getTransaction().commit();
		} finally {
			ent.close();
		}

	}

	@Override
	public void listarSorvete(String id) {
		EntityManager entityManager = getEntityManager();
	    Sorvete sorvete = null;
	    try {
	      sorvete = entityManager.find(Sorvete.class, id);
	    } finally {
	      entityManager.close();
	    }
	    return;
	  }

	private EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

	
	}

