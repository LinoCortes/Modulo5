package modelo;

import java.time.LocalDate;

public class Cliente extends Usuario {
	private int rut, edad;
	private String apellidos, telefono, afp, direccion, comuna;

	// se crean los constructores

	// se crea los metodos getters y setters

	public int getRut() {
		return rut;
	}

	public Cliente(int id, String run, int rut, int edad, String nombre, String apellidos, String telefono, String afp,
			String direccion, String comuna, String fechaNacimiento) {
		super(id, run, nombre, fechaNacimiento);
		this.edad = edad;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.rut= rut;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	public void setRut(int rut) {
		if (rut > 99999999) {
			System.out.println("El rut ingresado no es válido");
		} else {
			this.rut = rut;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	@Override
	public String toString() {
		return super.toString() + " Cliente [rut=" + rut + ", edad=" + edad + ", apellidos="
				+ apellidos + ", telefono=" + telefono + ", afp=" + afp + ", direccion=" + direccion + ", comuna="
				+ comuna + "]";
	}

}
