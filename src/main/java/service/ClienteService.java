package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexion.DBConnection;
import modelo.Cliente;
import modelo.Profesional;

public class ClienteService {
	DBConnection conexion = DBConnection.getInstance();

	public List<Cliente> findAllClientes() {

		List<Cliente> clientes = new ArrayList<>();
		DBConnection conexion = DBConnection.getInstance();
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, cliente.rut, cliente.edad, cliente.apellido, cliente.telefono, cliente.afp, cliente.direccion, cliente.comuna\r\n"
				+ "FROM cliente\r\n"
				+ "INNER JOIN usuario ON usuario.id=cliente.id_usuario;";

		try {

			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String run = rs.getString("run");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
				String rut = rs.getString("rut");
				int edad = rs.getInt("edad");
				String apellidos = rs.getString("apellido");
				String telefono = rs.getString("telefono");
				String afp = rs.getString("afp");
				String direccion = rs.getString("direccion");
				String comuna = rs.getString("comuna");
				Cliente cliente = new Cliente(id,run,rut,edad,nombre,apellidos,telefono,afp,direccion,comuna,fechaNacimiento);
				clientes.add(cliente);
				// System.out.println(students);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return clientes;
	}
}
