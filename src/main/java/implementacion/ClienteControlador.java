package implementacion;

import java.util.List;

import interfaces.IClienteControlador;
import modelo.Cliente;
import service.ClienteService;

public class ClienteControlador implements IClienteControlador{

	ClienteService clienteService = new ClienteService();
	
	@Override
	public List<Cliente> findAllClientes() {
		// TODO Auto-generated method stub
		return clienteService.findAllClientes();
	}

	@Override
	public Cliente crearCliente(Cliente cliente) {
		return clienteService.crearCliente(cliente);
		
	}
	
	@Override
	public Cliente findClienteById(int id) {
		// TODO Auto-generated method stub
		return clienteService.findClienteById(id);
	}

	
	
}