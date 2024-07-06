package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.dao.FacturaDetalleDAOImpl;
import com.distribuida.entities.FacturaDetalle;

public class PrincipalFacturaDetalle {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FacturaDetalleDAO facturaDetalleDAO = context.getBean("facturaDetalleDAOImpl", FacturaDetalleDAOImpl.class);
		
		List<FacturaDetalle> facturaDetalles = facturaDetalleDAO.finALL();
		
		facturaDetalles.forEach(item ->{
			System.out.println(item.toString());
		});
		
	}

}
