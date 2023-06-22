package modelo;


public class Profesional extends Usuario{
	
	String titulo, fechaIngreso;

	public Profesional(int id,String nombre,String run, String fechaNacimiento,String titulo, String fechaIngreso) {
		super(id,nombre,run,fechaNacimiento);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	

	public Profesional() {
		
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

	@Override
	public String toString() {
		return super.toString() + " Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
	

	
	
	
}
