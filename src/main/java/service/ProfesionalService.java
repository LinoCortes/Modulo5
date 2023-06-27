package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.DBConnection;
import modelo.Administrativo;
import modelo.Profesional;

public class ProfesionalService {
	DBConnection conexion = DBConnection.getInstance();

	public List<Profesional> findAllProfesionales() {

		List<Profesional> profesionales = new ArrayList<>();
		DBConnection conexion = DBConnection.getInstance();
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, profesional.titulo, profesional.fecha_ingreso\r\n"
				+ "FROM profesional\r\n" + "INNER JOIN usuario ON usuario.id=profesional.id_usuario;";

		try {

			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String run = rs.getString("run");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
				String titulo = rs.getString("titulo");
				String fechaIngreso = rs.getString("fecha_ingreso");
				Profesional profesional = new Profesional(id, nombre, run, fechaNacimiento, titulo, fechaIngreso);
				profesionales.add(profesional);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return profesionales;
	}

	public Profesional crearProfesional(Profesional profesional) {
		DBConnection conexion = DBConnection.getInstance();
		String sqlUsuario = "INSERT INTO usuario (nombre, run, fecha_nacimiento) " + "VALUES (?, ?, ?)";
		String sqlAdministrativo = "INSERT INTO profesional (id_usuario, titulo, fecha_ingreso) VALUES (?, ?, ?)";

		try {

			PreparedStatement usuarioStatement = conexion.getConnection().prepareStatement(sqlUsuario,
					Statement.RETURN_GENERATED_KEYS);
			usuarioStatement.setString(1, profesional.getNombre());
			usuarioStatement.setString(2, profesional.getRun());
			usuarioStatement.setString(3, profesional.getFechaNacimiento());
			usuarioStatement.executeUpdate();
			ResultSet generatedKeys = usuarioStatement.getGeneratedKeys();

			int idUsuario = -1;
			if (generatedKeys.next()) {
				idUsuario = generatedKeys.getInt(1);
			}

			PreparedStatement administrativoStatement = conexion.getConnection().prepareStatement(sqlAdministrativo);
			administrativoStatement.setInt(1, idUsuario);
			administrativoStatement.setString(2, profesional.getTitulo());
			administrativoStatement.setString(3, profesional.getFechaIngreso());
			administrativoStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return profesional;
	}

	public Profesional findProfesionalById(int id) {
		DBConnection conexion = DBConnection.getInstance();
		Profesional profesional = new Profesional();
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, profesional.titulo, profesional.fecha_ingreso\r\n"
				+ "FROM profesional\r\n" + "INNER JOIN usuario ON usuario.id=profesional.id_usuario\r\n"
				+ "WHERE profesional.id_usuario=?;";

		try {

			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				int id2 = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String run = rs.getString("run");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
				String titulo = rs.getString("titulo");
				String fechaIngreso = rs.getString("fecha_ingreso");

				profesional = new Profesional(id2, nombre, run, fechaNacimiento, titulo, fechaIngreso);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return profesional;
	}

	public void updateProfesional(Profesional profesionalUpdate) {
		DBConnection conexion = DBConnection.getInstance();
		// para generar insercion de datos a la tabla usuario
		String sqlUsuario = "UPDATE usuario\n" + "SET nombre = ?, run = ?, fecha_nacimiento = ?\n" + "WHERE id=?";
		// para generar la insercion de datos a la tabla administrativo
		String sqlAdministrativo = "UPDATE profesional SET  titulo = ?, fecha_ingreso = ? WHERE id_usuario = ?";
		
		try {

			PreparedStatement usuarioStatement = conexion.getConnection().prepareStatement(sqlUsuario);

			usuarioStatement.setString(1, profesionalUpdate.getNombre());
			usuarioStatement.setString(2, profesionalUpdate.getRun());
			usuarioStatement.setString(3, profesionalUpdate.getFechaNacimiento());
			usuarioStatement.setInt(4, profesionalUpdate.getId());
			usuarioStatement.executeUpdate();

			PreparedStatement profesionalStatement = conexion.getConnection().prepareStatement(sqlAdministrativo);

			profesionalStatement.setString(1, profesionalUpdate.getTitulo());
			profesionalStatement.setString(2, profesionalUpdate.getFechaIngreso());
			profesionalStatement.setInt(3, profesionalUpdate.getId());
			profesionalStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
