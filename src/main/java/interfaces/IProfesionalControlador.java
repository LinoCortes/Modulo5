package interfaces;

import java.util.List;
import modelo.Profesional;

public interface IProfesionalControlador {
	
	public List<Profesional> findAllProfesionales();
	
	public Profesional crearProfesional(Profesional profesional);

	Profesional findProfesionalById(int id);
}