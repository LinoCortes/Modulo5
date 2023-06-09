package modelo;

import java.time.LocalDate;

public class Usuario{
	private String nombres;
	private int run;
	private LocalDate fechaNacimiento;
	
	//se crean los constructores
	public Usuario() {
		
	}
	
	public Usuario(String nombre, int run, LocalDate fechaNacimiento) {
		this.nombres = nombre;
		this.run = run;
		this.fechaNacimiento = fechaNacimiento;
	}
	
		
	//se crean los getters y setters.
	public String getNombre() {
		return nombres;
	}


	public void setNombre(String nombre) {
		this.nombres = nombre;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	//Sobreescribe el metodo toString
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombres + ", run=" + run + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}
