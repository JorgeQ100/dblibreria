package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Cliente;

@Repository
public class ClienteDAOimpll implements ClienteDAO {
	
	@Autowired
	private SessionFactory ssessionFactory;


	@Override
	@Transactional
	public List<Cliente> findALL() {
		// TODO Auto-generated method stub
		Session session = ssessionFactory.getCurrentSession();
		return session.createQuery("from Cliente", Cliente.class).getResultList();
	}

	@Override
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dell(Cliente cliente) {
		// TODO Auto-generated method stub

	}

}




