package com.distribuida.entities;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Factura {
	
	private int idFactura;
	private String numFactura;
	private Date fecha;
	private double totalNeto;
	private double iva;
	private double total;
	private Cliente cliente;
	
	
	public Factura () {}
	
	public Factura(int idFactura, String numFactura, Date fecha, double totalNeto, double iva, double total) {
		this.idFactura = idFactura;
		this.numFactura = numFactura;
		this.fecha = fecha;
		this.totalNeto = totalNeto;
		this.iva = iva;
		this.total = total;
		
		
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public String getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotalNeto() {
		return totalNeto;
	}
	public void setTotalNeto(float totalNeto) {
		this.totalNeto = totalNeto;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", fecha=" + fecha + ", totalNeto="
				+ totalNeto + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + "]";
	}
	
	
	
	
	
	

}
