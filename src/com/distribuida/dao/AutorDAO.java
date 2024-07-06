package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Autor;

public interface AutorDAO {
	
	public List<Autor> finALL();
	
	public Autor findOne(int id);
	
	public void add (Autor autor);

	public void up (Autor autor);
	
	public void dell (int id);

}
