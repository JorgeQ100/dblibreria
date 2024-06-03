package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class FacturaDetalle {
	
	private int idfacturaDetalle;
	private int cantidad;
	private float subtotal;
	private Factura factura;
	private Libro libro;
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
