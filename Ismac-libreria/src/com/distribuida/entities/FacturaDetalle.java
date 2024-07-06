package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "factura_detalle")
public class FacturaDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura_detalle")
	private int idfacturaDetalle;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "subtotal")
	private float subtotal;
	
	@JoinColumn(name = "id_factura")
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,  CascadeType.REFRESH})
	private Factura factura;
	
	@JoinColumn(name = "id_libro")
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,  CascadeType.REFRESH})
	private Libro libro;
	
	public FacturaDetalle () {}
	
	public FacturaDetalle(int facturaDetalle, int cantidad, float subtotal, int idFactura, int idLibro) {
		this.idfacturaDetalle = facturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		
		
		
	}
	public int getFacturaDetalle() {
		return idfacturaDetalle;
	}
	public void setFacturaDetalle(int facturaDetalle) {
		this.idfacturaDetalle = facturaDetalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	@Override
	public String toString() {
		return "FacturaDetalle [idfacturaDetalle=" + idfacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
	
	
	
	
}
