package Datos;

import java.io.*; 
import java.sql.*;

 public class Conexion {
    public Connection coneccion = null;

    public void conecta(){
    
        try{
            System.out.println(" Buscando el driver de la base de datosPostgreSQL");
            Class.forName("org.postgresql.Driver");
           }catch(ClassNotFoundException e)
            {
              System.out.println(" No se encontro el nombre del driver de la base de datos PostgreSQL" + e.getMessage());       
            }
           
        try{
             System.out.println(" Estableciendo a la base de datos");
             String url = "jdbc:postgresql://localhost/tienda_vero";
             coneccion = DriverManager.getConnection(url, "postgres", "17ab97");
             System.out.println("Conexión exitosa"); 
           }
           catch(SQLException e)
           {
             System.out.println(" Excepción al establecer la conexión " +  e.getMessage());
           }
    }//método
 }//class
