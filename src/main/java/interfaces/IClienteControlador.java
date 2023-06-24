package interfaces;

import java.util.List;

import modelo.Cliente;

public interface IClienteControlador {
	
	public List<Cliente> findAllClientes();
	
	public Cliente crearCliente(Cliente cliente);

	public Cliente findClienteById(int id);

	public void updateCliente(Cliente clienteUpdate);
}
