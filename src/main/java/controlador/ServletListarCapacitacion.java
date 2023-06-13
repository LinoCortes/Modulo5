package controlador;

import java.util.List;
import interfaces.ICapacitacionesControlador;
import service.CapacitacionesService;
import modelo.Capacitacion;

public class ServletListarCapacitacion implements ICapacitacionesControlador {
	  
	  CapacitacionesService capacitacionesService = new CapacitacionesService();

	  @Override
	  public List<Capacitacion> findAllCapacitacion() {
	    return capacitacionesService.findAllCapacitacion();
	  }
}