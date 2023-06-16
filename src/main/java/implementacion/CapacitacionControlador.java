package implementacion;

import java.util.List;


import interfaces.ICapacitacionesControlador;
import service.CapacitacionesService;
import modelo.Capacitacion;

public class CapacitacionControlador implements ICapacitacionesControlador {
	  
	  CapacitacionesService capacitacionesService = new CapacitacionesService();

	  @Override
	  public List<Capacitacion> findAllCapacitacion() {
	    return capacitacionesService.findAllCapacitacion();
	  }
	  
	  @Override
	  public  Capacitacion crearCapacitaciones(Capacitacion capacitacion) {
	    return capacitacionesService.crearCapacitaciones(capacitacion);
	  }
}
