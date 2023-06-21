package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
				+ "FROM profesional\r\n"
				+ "INNER JOIN usuario ON usuario.id=profesional.id_usuario;";

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
				System.out.println("Se imprime profesional en ProfesionalService");
				System.out.println(profesional.toString());

				profesionales.add(profesional);
				// System.out.println(students);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return profesionales;
	}
}
