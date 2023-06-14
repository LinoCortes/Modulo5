package modelo;
import java.io.Serializable;

public class Capacitacion implements Serializable{
	int identificador,duracion,cantidadAsistentes,id;
	String tematica, dia,hora,lugar;
	String rutCliente;
	
	
	//se crean los constructores
	public Capacitacion() {
	    
	}	

	public Capacitacion(int id,int identificador, int duracion, int cantidadAsistentes, String rutCliente,
			String tematica, String dia, String hora, String lugar) {
		    this.id=id;
			this.identificador=identificador;
		    this.duracion = duracion;
		    this.cantidadAsistentes = cantidadAsistentes;
		    this.tematica = tematica;
		    this.lugar = lugar;
		    this.rutCliente = rutCliente;
		    this.dia = dia;
		    this.hora = hora;		      
    }
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	
	
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + ", id=" + id + ", tematica=" + tematica + ", dia=" + dia + ", hora=" + hora
				+ ", lugar=" + lugar + ", rutCliente=" + rutCliente + "]";
	}



	private static final long serialVersionUID = 1L;


	

	

	
	
}
