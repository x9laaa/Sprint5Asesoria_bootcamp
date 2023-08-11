package com.example.modulo5.conexion;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
   private static Connection conexion = null;
   private Conexion() {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgas_bd", "root", "admin");

       } catch (ClassNotFoundException exception) {
           exception.printStackTrace();
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }
    public static Connection getConexion(){
       if(conexion == null){
           new Conexion();
       }
       return conexion;


    }

}
