package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

@Controller
@RequestMapping("/Autor")
public class AutorController {
	
	@Autowired
	private AutorDAO autorDAO;
	
	@GetMapping("/findAll")
	public String findAll (Model model) {
		
		//try {
			
			List<Autor> autor = autorDAO.finALL();
			
			model.addAttribute("Autor", autor);
			
			return "Listar-Autores";
			
		//} catch (Exception e) {
			// TODO: handle exception
		//}
		
	}
	
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idAutor")@Nullable Integer idAutor
			             ,@RequestParam("opcion")@Nullable Integer opcion
			             , Model model){
		
		if(idAutor != null) {
			Autor autor = autorDAO.findOne(idAutor);
			model.addAttribute("Autor", autor);
		}
		
		if (opcion == 1) return "add-autor";
		else return "del-autor";
		
		
		
	}
	
	
	@PostMapping("/add")
	public String add(@RequestParam("idAutor")@Nullable Integer idAutor
	                 ,@RequestParam("nombre")@Nullable String nombre
	                 ,@RequestParam("apellido")@Nullable String apellido
	                 ,@RequestParam("pais")@Nullable String pais
	                 ,@RequestParam("direccion")@Nullable String direccion
	                 ,@RequestParam("telefono")@Nullable String telefono
	                 ,@RequestParam("correo")@Nullable String correo
	                 , Model model){
	                 
	                 if(idAutor == null){
	                 	Autor autor = new Autor(0, nombre, apellido, pais, direccion, telefono, correo);
	                 	autorDAO.add(autor);
	                 }else{
	                 	Autor autor2 = new Autor(idAutor, nombre, apellido, pais, direccion, telefono, correo);
	                 	autorDAO.up(autor2);
	                 }
	                 
	                 return "redirect:/clientes/findAll";
	                 
	                 }
	
	
	
	@GetMapping("/del")
	public String del(@RequestParam("idAutor")@Nullable Integer idAutor){
		
		autorDAO.dell(idAutor);
		return "redirect:/clientes/findAll";
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
