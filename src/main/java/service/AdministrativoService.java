package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.DBConnection;
import modelo.Administrativo;

public class AdministrativoService {
	DBConnection conexion = DBConnection.getInstance();

	public List<Administrativo> findAllAdministrativos() {

		List<Administrativo> administrativos = new ArrayList<>();
		DBConnection conexion = DBConnection.getInstance();
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, administrativo.area, administrativo.exp_previa\r\n"
				+ "FROM administrativo\r\n" + "INNER JOIN usuario ON usuario.id=administrativo.id_usuario;";

		//LISTADO
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
				

				administrativos.add(administrativo);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return administrativos;
	}

	public Administrativo crearAdministrativo(Administrativo administrativo) {
		DBConnection conexion = DBConnection.getInstance();
		// para generar insercion de datos a la tabla usuario
		String sqlUsuario = "INSERT INTO usuario (nombre, run, fecha_nacimiento) " + "VALUES (?, ?, ?)";
		// para generar la insercion de datos a la tabla administrativo
		String sqlAdministrativo = "INSERT INTO administrativo (id_usuario, area, exp_previa) VALUES (?, ?, ?)";

		try {
			// agregamos al final la sentencia Statement.RETURN_GENERATED_KEYS el cual
			// retorna el valor de la llave autogenerada
			// la cual recuperaremos posteriormente con el getGeneratedKeys()
			PreparedStatement usuarioStatement = conexion.getConnection().prepareStatement(sqlUsuario,
					Statement.RETURN_GENERATED_KEYS);
			usuarioStatement.setString(1, administrativo.getNombre());
			usuarioStatement.setString(2, administrativo.getRun());
			usuarioStatement.setString(3, administrativo.getFechaNacimiento());
			usuarioStatement.executeUpdate();

			// tomamos el id auto generado de la columna 1 de usuarios
			ResultSet generatedKeys = usuarioStatement.getGeneratedKeys();
			// convencion general de variable -1 cuando verifique que exista una columna en
			// el resulset va a recuperar
			// el valor de la primera columna dentro del if le pasamos el valor de la
			// primera columna a idUsuario
			int idUsuario = -1;
			if (generatedKeys.next()) {
				idUsuario = generatedKeys.getInt(1);
			}
			// como tenemos almacenado ya el valor que genero autmaticamente al crear
			// usuario en la variable idUsuario, la pasamos
			// como llave al campo id_usuario en la tabla administrativo.
			PreparedStatement administrativoStatement = conexion.getConnection().prepareStatement(sqlAdministrativo);
			administrativoStatement.setInt(1, idUsuario);
			administrativoStatement.setString(2, administrativo.getArea());
			administrativoStatement.setString(3, administrativo.getExperienciaPrevia());
			administrativoStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return administrativo;

	}

	//rescata la informacion previa al update
	public Administrativo findAdministrativoById(int id) {
		DBConnection conexion = DBConnection.getInstance();
		Administrativo administrativo = new Administrativo();
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, administrativo.area, administrativo.exp_previa\r\n"
				+ "FROM administrativo\r\n" + "INNER JOIN usuario ON usuario.id=administrativo.id_usuario\r\n"
				+ "WHERE administrativo.id_usuario=?;";

		try {

			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				int id2 = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String run = rs.getString("run");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
				String area = rs.getString("area");
				String expPrevia = rs.getString("exp_previa");
				
				administrativo = new Administrativo(id2,nombre,run,fechaNacimiento,area,expPrevia);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return administrativo;
	}
	
	public  void updateAdministrativo(Administrativo administrativo) {
		DBConnection conexion = DBConnection.getInstance();
		// para generar insercion de datos a la tabla usuario
		String sqlUsuario = "UPDATE usuario\n"
				+ "SET nombre = ?, run = ?, fecha_nacimiento = ?\n"
				+ "WHERE id=?";
		// para generar la insercion de datos a la tabla administrativo
		String sqlAdministrativo = "UPDATE administrativo SET  area = ?, exp_previa = ? WHERE id_usuario = ?";
		try {
			
			PreparedStatement usuarioStatement = conexion.getConnection().prepareStatement(sqlUsuario);
					
			usuarioStatement.setString(1, administrativo.getNombre());
			usuarioStatement.setString(2, administrativo.getRun());
			usuarioStatement.setString(3, administrativo.getFechaNacimiento());
			usuarioStatement.setInt(4, administrativo.getId());
			usuarioStatement.executeUpdate();

		
		
			PreparedStatement administrativoStatement = conexion.getConnection().prepareStatement(sqlAdministrativo);
			
			
			administrativoStatement.setString(1, administrativo.getArea());
			administrativoStatement.setString(2, administrativo.getExperienciaPrevia());
			administrativoStatement.setInt(3, administrativo.getId());
			administrativoStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	

	}
	
	
	
	
	
	
	
	
}
