package com.distribuida.entities;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component 
public class Cliente {

	//Atrivutos
		private int idCliente;
		private String cedula;
		private String nombre;
		private String apellido;
		private Date fechaNacimiento;
		private String telefono;
		private String correo;
		
		
		public Cliente(){}
		
		
		public Cliente(int idCliente, String cedula, String nombre, String apellido, Date fechaNacimiento,
				String telefono, String correo) {
						this.idCliente = idCliente;
			this.cedula = cedula;
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
			this.telefono = telefono;
			this.correo = correo;
		}


		public int getIdCliente() {
			return idCliente;
		}


		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}


		public String getCedula() {
			return cedula;
		}


		public void setCedula(String cedula) {
			this.cedula = cedula;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public void setApellido(String apellido) {
			this.apellido = apellido;
		}


		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}


		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}


		public String getTelefono() {
			return telefono;
		}


		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}


		public String getCorreo() {
			return correo;
		}


		public void setCorreo(String correo) {
			this.correo = correo;
		}


		@Override
		public String toString() {
			return "Cliente [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
					+ apellido + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", correo="
					+ correo + "]";
		}
		
		
		
		
		
		
		
	}
	 
	
	


