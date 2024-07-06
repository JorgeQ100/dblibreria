package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Cliente;

public interface ClienteDAO {

	
	//CRUD basicos
	public List<Cliente> findALL();
	
	public Cliente findOne(int id);
	
	public void add (Cliente cliente);
	
	public void up (Cliente cliente);
	
	public void dell (int id);
	
	
	//CRUD avansados
	
}
