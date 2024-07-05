package com.distribuida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;


@Controller
@RequestMapping("/facturacion")
public class FacturaController {
	
	@Autowired
	private FacturaDAO facturaDAO;
	
	@Autowired
	private FacturaDetalleDAO facturaDetalleDAO;
	
	
	@GetMapping("/findAll")
	public String findAll(ModelMap modelMap) {
		
		modelMap.addAttribute("Factruras", facturaDAO.findALL());
		
		return "listar-facturas";
	}

}
