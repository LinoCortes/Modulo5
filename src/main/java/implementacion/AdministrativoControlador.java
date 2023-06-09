package implementacion;

import java.util.List;

import interfaces.IAdministrativoControlador;
import modelo.Administrativo;
import service.AdministrativoService;

public class AdministrativoControlador implements IAdministrativoControlador {

	AdministrativoService administrativoService = new AdministrativoService();

	@Override
	public List<Administrativo> findAllAdministrativos() {
		return administrativoService.findAllAdministrativos();
	}

	@Override
	public Administrativo crearAdministrativo(Administrativo administrativo) {
		return administrativoService.crearAdministrativo(administrativo);

	}
	
   @Override
    public  void  updateAdministrativo(Administrativo administrativo) {
	   administrativoService.updateAdministrativo(administrativo);
		
	}
	
	@Override
	public Administrativo findAdministrativoById(int id) {
		return administrativoService.findAdministrativoById(id);
	}
}
