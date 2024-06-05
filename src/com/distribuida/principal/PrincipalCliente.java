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
		
		
		List<Cliente> clientes= clienteDAO.findALL();
		
		clientes.forEach(item ->{
			System.out.println(item.toString());	
		});
			
		
		
		
		context.close();

	}

}
