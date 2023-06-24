package interfaces;

import java.util.List;
import modelo.Profesional;

public interface IProfesionalControlador {
	
	public List<Profesional> findAllProfesionales();
	
	public Profesional crearProfesional(Profesional profesional);

	public Profesional findProfesionalById(int id);
	
	public void updateProfesional(Profesional profesional);
}