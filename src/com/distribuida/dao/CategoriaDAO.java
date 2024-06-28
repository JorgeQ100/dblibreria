package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Categoria;

public interface CategoriaDAO {
	
	public List<Categoria> finALL();
	
	public Categoria findOne(int id);
	
	public void add (Categoria categoria);
	
	public void up (Categoria categoria);
	
	public void dell (int id);

	
	
}
