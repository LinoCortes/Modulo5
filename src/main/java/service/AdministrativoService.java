package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexion.DBConnection;
import modelo.Administrativo;
import modelo.Capacitacion;

public class AdministrativoService {
	DBConnection conexion = DBConnection.getInstance();

	public List<Administrativo> findAllAdministrativos() {

		List<Administrativo> administrativos = new ArrayList<>();
		DBConnection conexion = DBConnection.getInstance();
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, administrativo.area, administrativo.exp_previa\r\n"
				+ "FROM administrativo\r\n"
				+ "INNER JOIN usuario ON usuario.id=administrativo.id_usuario;";

		try {

			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String run = rs.getString("run");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
				String area = rs.getString("area");
				String expPrevia = rs.getString("exp_previa");
				Administrativo administrativo = new Administrativo(id, nombre, run, fechaNacimiento, area, expPrevia);
				System.out.println("Se imprime administrativo en AdministrativoService");
				System.out.println(administrativo.toString());

				administrativos.add(administrativo);
				// System.out.println(students);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return administrativos;
	}

	public Capacitacion crearCapacitaciones(Capacitacion capacitacion) {
		DBConnection conexion = DBConnection.getInstance();
		System.out.println("Insertar un administrativo");
		String sqlUsuario = "INSERT INTO usuario (nombre, run, fecha_nacimiento) VALUES (?, ?, ?)";

		try {
			PreparedStatement statement = conexion.getConnection().prepareStatement(sqlUsuario);
			statement.setInt(1, capacitacion.getIdentificador());
			statement.setInt(2, capacitacion.getDuracion());
			statement.setInt(3, capacitacion.getCantidadAsistentes());
			statement.setString(4, capacitacion.getRutCliente());
			statement.setString(5, capacitacion.getTematica());
			statement.setString(6, capacitacion.getDia());
			statement.setString(7, capacitacion.getHora());
			statement.setString(8, capacitacion.getLugar());

			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return capacitacion;
	}
}
