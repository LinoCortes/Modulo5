package test;


import java.sql.ResultSet;
import java.sql.Statement;

import conexion.DBConnection;
import modelo.Capacitacion;

public class DBTestConnection {
  
  private static DBConnection instanceDbConnection;
  
  DBTestConnection() {
    instanceDbConnection = DBConnection.getInstance();
  }
  
  public static void main(String[] args) {
    new DBTestConnection();
    findAllCapacitacion();
 
  }
  
  public static void findAllCapacitacion() {
    
    String sql = "SELECT * FROM capacitaciones";
    
    try {
      Statement statement = instanceDbConnection.getConnection().createStatement();
      ResultSet rs = statement.executeQuery(sql);
      
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
        System.out.println(capacitacion.toString());
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
}