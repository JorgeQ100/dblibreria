package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

import javassist.ClassPath;

public class PrincipalAutor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Patron IoC inverción de control
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl2", AutorDAO.class);
		
		//CRUD:  CREATE, READ, UPDATE, DELETE
		
		//ADD
		Autor autor = new Autor(0,"Juan","taipe","pais1","av. por ahi..","0992860039","juantipe@corre.com");
		//autorDAO.add(autor);
		
		
		
		//192.168.4.241
		//UP
		Autor autor2 = new Autor(54,"Juann","taipeh","pais21","av. por ahi..","0992860039","juantipe@corre.com");
		//autorDAO.up(autor2);
		
		//dell
		autorDAO.dell(54);
		System.out.println("********************* DEL ***********"+autorDAO.findOne(55));
		
		//finALL
		//
		autorDAO.finALL().forEach(item -> {System.out.println(item.toString());});
		
		
		
		
		
		
		
		context.close();

	}

}
