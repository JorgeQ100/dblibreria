package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

import javassist.ClassPath;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Patron IoC inverción de control
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOimpll", ClienteDAO.class);
		
		//CRUD:  CREATE, READ, UPDATE, DELETE
		
		//ADD
		Cliente cliente = new Cliente(0,"taipe","1750866814","jyaipe203@correo.com","av. por ahi..","Juan","099285033");
		clienteDAO.add(cliente);
		
		//UP
		//Cliente cliente2 = new Cliente(1,"122568482","juan","taipe2","av. pot ahi..","099285033","jyaipe203@correo.com");
		//clienteDAO.up(cliente2);
		
		//dell
		//clienteDAO.dell(1);
		System.out.println("********************* DEL ***********"+clienteDAO.findOne(1));
		
		//finALL
		//
		clienteDAO.findALL().forEach(item -> {System.out.println(item.toString());});
		
		
		
		
		
		
		
		context.close();

	}

}
