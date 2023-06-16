package interfaces;

import java.util.List;
import modelo.Usuario;

public interface IUsuariosControlador {

	public List<Usuario> findAllUsuario();
	    
	public Usuario crearUsuarios(Usuario usuario); 

}