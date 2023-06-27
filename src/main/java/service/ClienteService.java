package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.DBConnection;
import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;

public class ClienteService {
	DBConnection conexion = DBConnection.getInstance();

	public List<Cliente> findAllClientes() {

		List<Cliente> clientes = new ArrayList<>();
		DBConnection conexion = DBConnection.getInstance();
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, cliente.rut, cliente.edad, cliente.apellido, cliente.telefono, cliente.afp, cliente.direccion, cliente.comuna\r\n"
				+ "FROM cliente\r\n" + "INNER JOIN usuario ON usuario.id=cliente.id_usuario;";

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
				Cliente cliente = new Cliente(id, run, rut, edad, nombre, apellidos, telefono, afp, direccion, comuna,
						fechaNacimiento);
				clientes.add(cliente);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return clientes;
	}

	public Cliente crearCliente(Cliente cliente) {
		DBConnection conexion = DBConnection.getInstance();
		String sqlUsuario = "INSERT INTO usuario (nombre, run, fecha_nacimiento) " + "VALUES (?, ?, ?)";

		String sqlCliente = "INSERT INTO cliente (id_usuario, rut, edad, apellido, telefono, afp, direccion, comuna) VALUES (?,?, ?,?,?,?,?,?)";

		try {

			PreparedStatement usuarioStatement = conexion.getConnection().prepareStatement(sqlUsuario,
					Statement.RETURN_GENERATED_KEYS);
			usuarioStatement.setString(1, cliente.getNombre());
			usuarioStatement.setString(2, cliente.getRun());
			usuarioStatement.setString(3, cliente.getFechaNacimiento());
			usuarioStatement.executeUpdate();

			ResultSet generatedKeys = usuarioStatement.getGeneratedKeys();

			int idUsuario = -1;
			if (generatedKeys.next()) {
				idUsuario = generatedKeys.getInt(1);
			}

			PreparedStatement clienteStatement = conexion.getConnection().prepareStatement(sqlCliente);
			clienteStatement.setInt(1, idUsuario);
			clienteStatement.setString(2, cliente.getRut());
			clienteStatement.setInt(3, cliente.getEdad());
			clienteStatement.setString(4, cliente.getApellidos());
			clienteStatement.setString(5, cliente.getTelefono());
			clienteStatement.setString(6, cliente.getAfp());
			clienteStatement.setString(7, cliente.getDireccion());
			clienteStatement.setString(8, cliente.getComuna());
			clienteStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return cliente;

	}

	public Cliente findClienteById(int id) {
		DBConnection conexion = DBConnection.getInstance();
		Cliente cliente = new Cliente();
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, cliente.rut, "
				+ "cliente.edad, cliente.apellido, cliente.telefono, cliente.afp, cliente.direccion, cliente.comuna\r\n"
				+ "FROM cliente INNER JOIN usuario ON usuario.id=cliente.id_usuario\r\n"
				+ "WHERE cliente.id_usuario=?;\r\n";

		try {

			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				int id2 = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String run = rs.getString("run");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
				String rut = rs.getString("rut");
				int edad = rs.getInt("edad");
				String apellido = rs.getString("apellido");
				String telefono = rs.getString("telefono");
				String afp = rs.getString("afp");
				String direccion = rs.getString("direccion");
				String comuna = rs.getString("comuna");

				cliente = new Cliente(id2, run, rut, edad, nombre, apellido, telefono, afp, direccion, comuna,
						fechaNacimiento);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return cliente;
	}

	public void updateCliente(Cliente clienteUpdate) {
		DBConnection conexion = DBConnection.getInstance();
		// para generar insercion de datos a la tabla usuario
		String sqlUsuario = "UPDATE usuario SET nombre = ?, run = ?, fecha_nacimiento = ? WHERE id=?";
		// para generar la insercion de datos a la tabla cliente
		String sqlCliente = "UPDATE cliente SET  rut = ?,  edad= ?, apellido= ?, direccion= ?, comuna= ?, afp= ?, telefono= ? WHERE id_usuario = ?";
		try {

			PreparedStatement usuarioStatement = conexion.getConnection().prepareStatement(sqlUsuario);

			usuarioStatement.setString(1, clienteUpdate.getNombre());
			usuarioStatement.setString(2, clienteUpdate.getRun());
			usuarioStatement.setString(3, clienteUpdate.getFechaNacimiento());
			usuarioStatement.setInt(4, clienteUpdate.getId());
			usuarioStatement.executeUpdate();

			PreparedStatement clienteStatement = conexion.getConnection().prepareStatement(sqlCliente);

			clienteStatement.setString(1, clienteUpdate.getRut());
			clienteStatement.setInt(2, clienteUpdate.getEdad());
			clienteStatement.setString(3, clienteUpdate.getApellidos());
			clienteStatement.setString(4, clienteUpdate.getDireccion());
			clienteStatement.setString(5, clienteUpdate.getComuna());
			clienteStatement.setString(6, clienteUpdate.getAfp());
			clienteStatement.setString(7, clienteUpdate.getTelefono());
			clienteStatement.setInt(8, clienteUpdate.getId());
			clienteStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
