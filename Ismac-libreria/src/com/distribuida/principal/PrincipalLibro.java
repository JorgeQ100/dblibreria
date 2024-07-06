package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;

public class PrincipalLibro {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
		
		List<Libro> libros = libroDAO.finALL();
		
		libros.forEach(item ->{
			System.out.println(item.toString());

		});
		
		

	}

}
