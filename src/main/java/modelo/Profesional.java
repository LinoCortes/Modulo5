package modelo;

import java.time.LocalDate;

public class Profesional extends Usuario{
	
	String titulo, fechaIngreso;

	public Profesional(String nombres,int run, LocalDate fechaNacimiento,String titulo, String fechaIngreso) {
		super(nombres,run, fechaNacimiento);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
	

	
	
	
}
