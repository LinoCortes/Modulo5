package modelo;

public class Capacitacion {
	int identificador,duracion,cantidadAsistentes;
	String tematica, rutCliente,dia,hora,lugar;
	
	
	//se crean los constructores
	public Capacitacion() {
	    
	}	

	public Capacitacion(int identificador, int duracion, int cantidadAsistentes, String rut,
			String tematica, String dia, String hora, String lugar) {
		    this.identificador=identificador;
		    this.duracion = duracion;
		    this.cantidadAsistentes = cantidadAsistentes;
		    this.tematica = tematica;
		    this.lugar = lugar;
		    this.rutCliente = rut;
		    this.dia = dia;
		    this.hora = hora;		      
    }
	
	
	//se crean los setters.
	public void setIdentificador(int identificador) {
		this.identificador=identificador;	
	} 
	public void setDuracion(int duracion) {
		 this.duracion = duracion;
	} 
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	} 
	public void setLugar(String lugar) {
		 this.lugar = lugar;
	} 
	public void setRutCliente(String rut) {
		this.rutCliente = rut;
	} 
	public void setDia(String dia) {
		this.dia = dia;
	} 
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	
	//se crean los getters
	
	public String getRutCliente() {
		return rutCliente;
	}
	public int getIdentificador() {
		return identificador;
	}
	public int getDuracion() {
		return duracion;
	}
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
	public String getLugar() {
		return lugar;
	}
	public String getDia() {
		return dia;
	}
	public String getHora() {
		return hora;
	}
	
	public String getTematica() {
		return tematica;
	}
	
}
