package modelo;

import java.time.LocalDate;

public class Administrativo extends Usuario{
	
	String area, experienciaPrevia;
	
	public Administrativo(String nombres, int run, LocalDate fechaNacimiento, String area, String experienciaPrevia) {
		super(nombres,run, fechaNacimiento);
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
}