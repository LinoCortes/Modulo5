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
		// TODO Auto-generated method stub
		return null;
	}
	
}