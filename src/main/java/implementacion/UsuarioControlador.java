package implementacion;

import java.util.List;

import interfaces.IUsuariosControlador;
import modelo.Usuario;
import service.UsuariosService;

public class UsuarioControlador implements IUsuariosControlador {

	UsuariosService usuariosService = new UsuariosService();

	@Override
	public List<Usuario> findAllUsuario() {
		return usuariosService.findAllUsuario();
	}

	@Override
	public Usuario crearUsuarios(Usuario usuario) {
		return usuariosService.crearUsuarios(usuario);
	}
}