package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Factura;

public interface FacturaDAO {

	
	//CRUD basicos
	public List<Factura> findALL();
	
	public Factura findOne(int id);
	
	public void add (Factura factura);
	
	public void up (Factura factura);
	
	public void dell (int id);
	
	
	//CRUD avansados
	
}
