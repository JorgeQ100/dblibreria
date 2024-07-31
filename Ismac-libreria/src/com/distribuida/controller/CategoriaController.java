package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<Categoria> categorias = categoriaDAO.finALL();
		model.addAttribute("categoria", categorias);
		return "Listar-Categoria";
	}
	
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idCategoria")@Nullable Integer idCategoria
			             ,@RequestParam("opcion")@Nullable Integer opcion
			             ,Model model) {
		
		if(idCategoria != null) {
			Categoria categoria = categoriaDAO.findOne(idCategoria);
			model.addAttribute("categoria", categoria);
		}
		
		if(opcion == 1) return "add-categorias";
		else return "del-categorias";
	}
	
	@GetMapping("/add")
	public String add(@RequestParam("idCategoria")@Nullable Integer idCategoria
			         ,@RequestParam("Categoria")@Nullable String Categoria
			         ,@RequestParam("descripcion")@Nullable String descripcion
			         ,Model model) {
		
		if(idCategoria == null) {
			Categoria categoria = new Categoria(0, Categoria, descripcion);
			categoriaDAO.add(categoria);
		}else {
			Categoria categoria2 = new Categoria(idCategoria, Categoria, descripcion);
			categoriaDAO.add(categoria2);
		}
		
		return "redirect:/categorias/findAll";
		
	}
	
	@GetMapping("/del")
	public String del(@RequestParam("idCategoria")@Nullable Integer idCategoria) {
		
		categoriaDAO.dell(idCategoria);
		return "redirect:/categorias/findAll";
		
		
	}
	
	
	
	
	
	
}
