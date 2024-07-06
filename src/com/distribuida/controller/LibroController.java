package com.distribuida.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;

@Controller
@RequestMapping("/libors")
public class LibroController {
	
	@Autowired
	private LibroDAO libroDAO;
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Autowired
	private AutorDAO autorDAO;
	
	
	
	
	@GetMapping("/findAll")
	private String findAll(ModelMap modelMap) {
		
		List<Libro> libros = libroDAO.finALL();
		modelMap.addAttribute("libros", libros);
		return "listar-libros";
		
	}
	
	
	@GetMapping("findOne")
	private String finOne(@RequestParam("idLibro")@Nullable Integer idLibro
			            , @RequestParam("opcion")@Nullable Integer opcion
			            , ModelMap modelMap) {
		
		if(idLibro != null) {
			Libro libro = libroDAO.findOne(idLibro);
			modelMap.addAttribute("libro", libro);
		}
		
		modelMap.addAttribute("autores", autorDAO.finALL());
		modelMap.addAttribute("categoria", categoriaDAO.finALL());
		
		
		if (opcion == 1 )return "add-libros";
		else return "del-libros";
			
	}
	
	
	@PostMapping("/add")
	private String add(@RequestParam("idLibro")@Nullable Integer idLibro
			, @RequestParam("titulo")@Nullable String titulo
			, @RequestParam("editorial")@Nullable String editorial
			, @RequestParam("numPaginas")@Nullable Integer numPaginas
			, @RequestParam("edicion")@Nullable String edicion
			, @RequestParam("idioma")@Nullable String idioma
			, @RequestParam("fechaPublicacion")@Nullable Date fechaPublicacion
			, @RequestParam("descripcion")@Nullable String descripcion
			, @RequestParam("tipoPasta")@Nullable String tipoPasta
			, @RequestParam("ISBN")@Nullable String ISBN
			, @RequestParam("numEjemplares")@Nullable Integer numEjemplares
			, @RequestParam("portada")@Nullable String portada
			, @RequestParam("presentacion")@Nullable String presentacion
			, @RequestParam("precio")@Nullable float precio
			, @RequestParam("id_categoria")@Nullable Integer id_categoria
			, @RequestParam("id_autor")@Nullable Integer id_autor
			, ModelMap modelMap
			) {
		
		if(idLibro == null) {
			
			Libro libro = new Libro(0, titulo, editorial, numPaginas, edicion, idioma, fechaPublicacion
					, descripcion, tipoPasta, ISBN, numEjemplares, portada, presentacion, precio);
			libro.setCategoria(categoriaDAO.findOne(id_categoria));
			libro.setAutor(autorDAO.findOne(id_autor));
			
			libroDAO.add(libro);
			
		}else {
			
			Libro libro = new Libro(idLibro, titulo, editorial, numPaginas, edicion, idioma, fechaPublicacion
					, descripcion, tipoPasta, ISBN, numEjemplares, portada, presentacion, precio);
			libro.setCategoria(categoriaDAO.findOne(id_categoria));
			libro.setAutor(autorDAO.findOne(id_autor));
			
			libroDAO.up(libro);
			
		}
		
		
		return "redirect:/libros/listar-libros";
	}
	
	
	@GetMapping("/del")
	private String del(@RequestParam("idLibro")@Nullable Integer idLibro ) {
		libroDAO.dell(idLibro);
		return "redirect:/libros/listar-libros";
	}
	
	
	
	
	
	
	


	
	
}
