package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Autor;

@Repository
public class AutorDAOImpl implements AutorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Autor> finALL() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Autor", Autor.class).getResultList();
	}

	@Override
	public void add(Autor autor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Autor autor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dell(Autor autor) {
		// TODO Auto-generated method stub

	}

}
