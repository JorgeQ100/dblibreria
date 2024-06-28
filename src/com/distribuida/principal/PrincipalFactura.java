package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDAO facturaDAO = context.getBean("facturaDAOimpll", FacturaDAO.class);
		ClienteDAO clienteDAO = context.getBean("clienteDAOimpll", ClienteDAO.class);
		
		
		// CRUD : CREATE , READ, UPDATE, DELETE
		// Add   
		Factura factura = new Factura(0,"FAC-0090", new Date(), 60.30, 15.36, 75.35);
		factura.setCliente(clienteDAO.findOne(1));
		//facturaDAO.add(factura);
		
		
		// Up
		Factura factura2 = new Factura(86,"FAC-0091", new Date(), 60.32, 15.32, 75.32);
		factura2.setCliente(clienteDAO.findOne(2));
		//facturaDAO.up(factura2);
		
		
		// del
		facturaDAO.dell(86);
		
		//findOne
		System.out.println("***************** Borrando *****************"+facturaDAO.findOne(86));
		
		
		// findAll
		//List<Factura> Facturas = FacturaDAO.findAll();				
		facturaDAO.findALL().forEach(item -> {System.out.println(item.toString());});
			
		context.close();
		

	}

}
