package interfaces;

import java.util.List;

import modelo.Cliente;

public interface IClienteControlador {
	
	public List<Cliente> findAllClientes();
	
	public Cliente crearCliente(Cliente cliente);
}
