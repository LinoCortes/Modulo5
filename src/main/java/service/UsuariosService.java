package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexion.DBConnection;
import modelo.Capacitacion;
import modelo.Usuario;

public class UsuariosService {

	DBConnection conexion = DBConnection.getInstance();

	public List<Usuario> findAllUsuario() {

		List<Usuario> usuarios = new ArrayList<>();
		DBConnection conexion = DBConnection.getInstance();
		String sql = "SELECT * FROM usuario";

		try {

			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String run = rs.getString("run");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
				Usuario usuario = new Usuario(id,run,nombre,fechaNacimiento);
				usuarios.add(usuario);
				
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return usuarios;
	}

	public Usuario crearUsuarios(Usuario usuario) {
		DBConnection conexion = DBConnection.getInstance();
		String sql = "INSERT INTO usuario (nombre,run,fecha_nacimiento) values (?,?,?)";
		try {
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			statement.setString(1, usuario.getNombre());
			statement.setString(2, usuario.getRun());
			statement.setString(3, usuario.getFechaNacimiento());

			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return usuario;
	}
}