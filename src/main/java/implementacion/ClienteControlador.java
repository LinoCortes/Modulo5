package implementacion;

import java.util.List;
import interfaces.IClienteControlador;
import modelo.Cliente;
import service.ClienteService;

public class ClienteControlador implements IClienteControlador{

	ClienteService clienteService = new ClienteService();
	
	@Override
	public List<Cliente> findAllClientes() {
		return clienteService.findAllClientes();
	}

	@Override
	public Cliente crearCliente(Cliente cliente) {
		return clienteService.crearCliente(cliente);
		
	}
	
	@Override
	public Cliente findClienteById(int id) {
		return clienteService.findClienteById(id);
	}
	
	@Override
	public void updateCliente(Cliente clienteUpdate) {
		clienteService.updateCliente(clienteUpdate);
	}
}