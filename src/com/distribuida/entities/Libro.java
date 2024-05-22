package com.distribuida.entities;
import java.util.Date;

public class Libro {
	
	private int idLibro;
	private String titulo;
	private String editorial;
	private int numPaginas;  
	private String edicion;
	private String idioma;
	private Date fechaPublicacion;
	private	String descripcion;
	private String tipoPasta;
	private String ISBN;
	private int numEjemplares;
	private String portada;
	private String presentacion;
	private float precio;
	private Categoria categoria;
	private Autor autor;
	
	public Libro() {}
	
	public Libro(int idLibro, String titulo, String editorial, int numPaginas, String edicion, String idioma,
			Date fechaPublicacion, String descripcion, String tipoPasta, String iSBN, int numEjemplares, String portada,
			String presentacion, float precio) {
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fechaPublicacion = fechaPublicacion;
		this.descripcion = descripcion;
		this.tipoPasta = tipoPasta;
		ISBN = iSBN;
		this.numEjemplares = numEjemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoPasta() {
		return tipoPasta;
	}

	public void setTipoPasta(String tipoPasta) {
		this.tipoPasta = tipoPasta;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", numPaginas="
				+ numPaginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechaPublicacion=" + fechaPublicacion
				+ ", descripcion=" + descripcion + ", tipoPasta=" + tipoPasta + ", ISBN=" + ISBN + ", numEjemplares="
				+ numEjemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", categoria=" + categoria + ", autor=" + autor + "]";
	}

	
	
	
}
