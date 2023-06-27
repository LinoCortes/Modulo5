package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexion.DBConnection;
import modelo.Capacitacion;

public class CapacitacionesService {

	DBConnection conexion = DBConnection.getInstance();

	public List<Capacitacion> findAllCapacitacion() {

		List<Capacitacion> capacitaciones = new ArrayList<>();
		DBConnection conexion = DBConnection.getInstance();
		String sql = "SELECT * FROM capacitaciones";

		try {

			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				int identificador = rs.getInt("identificador");
				int duracion = rs.getInt("duracion");
				int cantidadAsistentes = rs.getInt("cantidadAsistentes");
				String tematica = rs.getString("tematica");
				String rutCliente = rs.getString("rutCliente");
				String dia = rs.getString("dia");
				String hora = rs.getString("hora");
				String lugar = rs.getString("lugar");
				Capacitacion capacitacion = new Capacitacion(id, identificador, duracion, cantidadAsistentes, tematica,
						rutCliente, dia, hora, lugar);
				capacitaciones.add(capacitacion);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return capacitaciones;
	}

	public Capacitacion crearCapacitaciones(Capacitacion capacitacion) {
		DBConnection conexion = DBConnection.getInstance();
		String sql = "INSERT INTO capacitaciones (identificador, duracion, cantidadAsistentes, rutCliente, tematica, dia, hora, lugar) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
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