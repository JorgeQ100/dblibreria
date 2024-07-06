package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.FacturaDetalle;

@Repository
public class FacturaDetalleDAOImpl implements FacturaDetalleDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<FacturaDetalle> finALL() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from FacturaDeatlle", FacturaDetalle.class).getResultList();
	}

	@Override
	@Transactional
	public FacturaDetalle findOne(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(FacturaDetalle.class, id);
	}

	@Override
	public void add(FacturaDetalle facturaDetalle) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(facturaDetalle);
	}

	@Override
	public void up(FacturaDetalle facturaDetalle) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(facturaDetalle);
	}

	@Override
	public void dell(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));

	}

	

}
