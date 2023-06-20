package interfaces;

import java.util.List;
import modelo.Cliente;


public interface IAdministrativoControlador {
	public List<Cliente> findAllClientes();
	
	public Cliente crearCliente(Cliente cliente);
}
