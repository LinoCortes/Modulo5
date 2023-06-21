package implementacion;

import java.util.List;

import interfaces.IProfesionalControlador;
import modelo.Profesional;
import service.ProfesionalService;

public class ProfesionalControlador implements IProfesionalControlador{

	ProfesionalService profesionalService = new ProfesionalService();
	
	@Override
	public List<Profesional> findAllProfesionales() {
		return profesionalService.findAllProfesionales();
	}

	@Override
	public Profesional crearProfesional(Profesional profesional) {
		// TODO Auto-generated method stub
		return null;
	}
	
}