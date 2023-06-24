package implementacion;

import java.util.List;

import interfaces.IProfesionalControlador;
import modelo.Cliente;
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
		return profesionalService.crearProfesional(profesional);
		
	}
	
	@Override 
	public Profesional findProfesionalById(int id) {
		return profesionalService.findProfesionalById(id);
	}
	
	@Override
	public void updateProfesional(Profesional profesionalUpdate) {
		profesionalService.updateProfesional(profesionalUpdate);
	}
	
}
