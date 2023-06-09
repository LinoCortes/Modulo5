package modelo;

import java.time.LocalDate;

public class Cliente extends Usuario{
	private int rut,edad;
	private String nombres,apellidos,telefono,afp,direccion,comuna;
	private LocalDate fechaNacimiento;
	
	//se crean los constructores
	
	
	//se crea los metodos getters y setters

	public int getRut() {
		return rut;
	}

	public Cliente(int rut, int edad, String nombres, String apellidos, String telefono, String afp, String direccion,
			String comuna, LocalDate fechaNacimiento) {
		super(nombres, rut, fechaNacimiento);
		this.edad = edad;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	public void setRut(int rut) {
		if (rut>99999999) {
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

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
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
	
}
