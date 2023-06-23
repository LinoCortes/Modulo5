package interfaces;

import java.util.List;
import modelo.Administrativo;

public interface IAdministrativoControlador {
	public List<Administrativo> findAllAdministrativos();

	public Administrativo crearAdministrativo(Administrativo administrativo);
	
	public Administrativo findAdministrativoById(int id);

}
