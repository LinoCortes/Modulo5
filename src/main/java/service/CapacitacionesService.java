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
      
      while(rs.next()) {
    	int id = rs.getInt("id");
        int identificador = rs.getInt("identificador");
        int duracion = rs.getInt("duracion"); 
        int cantidadAsistentes = rs.getInt("cantidadAsistentes");
        String tematica = rs.getString("tematica");
        String rutCliente = rs.getString("rutCliente");
        String dia = rs.getString("dia");
        String hora = rs.getString("hora");
        String lugar = rs.getString("lugar");
        Capacitacion capacitacion = new Capacitacion(id,identificador, duracion, cantidadAsistentes, tematica,
        rutCliente, dia, hora, lugar);
        
       capacitaciones.add(capacitacion);
        // System.out.println(students);
      }
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return capacitaciones;
  }
  
  /*public boolean deleteStudentById(int idStudent) {
    
    DBConnection conexion = DBConnection.getInstance();
    String sql = "DELETE FROM students WHERE id = ?" ;
    
    try {
      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
      statement.setInt(1, idStudent);
      int rowsAffected = statement.executeUpdate();
      
      return rowsAffected > 0;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return false;
    }
     
  }
  
  /*public Capacitacion findByIdStudent(int id) {
    
    Student student = null;
    String sql = "SELECT * FROM students WHERE id = ?";
    
    try {
      
      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
      statement.setInt(1, id);
      ResultSet rs = statement.executeQuery();
      
      if(rs.next()) {
        String name = rs.getString("name");
        String lastname = rs.getString("lastname");
        String email = rs.getString("email");
        
        student = new Student(id, name, lastname, email );
        
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    return student;
  }*/
  
  
  /*public Student updateStudent(Student student) {
    
    String sql = "UPDATE students SET name = ?, lastname = ?, email = ? WHERE id = ?";
    
    try {
      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
      statement.setString(1, student.getName());
      statement.setString(2, student.getLastname());
      statement.setString(3, student.getEmail());
      statement.setInt(4, student.getId());
      // statement.executeQuery(); // aqui estaba el error!! es Update
      statement.executeUpdate();
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    return student;
  }
  */
  
}