package modelo;

import java.time.LocalDate;

public class Administrativo extends Usuario{
	
	String area, experienciaPrevia;
	
	public Administrativo() {
		
	}
	
	public Administrativo(int id,String nombre, String run, String fechaNacimiento, String area, String experienciaPrevia) {
		super(id,nombre,run,fechaNacimiento);
		this.area=area;
		this.experienciaPrevia=experienciaPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String toString() {
		
		return super.toString()+" Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}
}