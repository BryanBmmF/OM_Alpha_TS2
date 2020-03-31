/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnz.backend.manejadores;

import gnz.backend.conexion.Conexion;
import gnz.frontend.FrameOM;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author jesfrin
 */
public class ManejadorDeLog {

    private static void guardarAccionParaUsuario(String descripcion) throws SQLException {
        if (FrameOM.getIdUsuario() != null) {
            String consulta = "INSERT INTO ACCION(Descripcion,Fecha,SESION_Id_Sesion) VALUES(?,?,?)";
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
            sentencia.setString(1, descripcion);
            sentencia.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            sentencia.setInt(3, FrameOM.getIdSesion());
            sentencia.execute();
        }

    }

    private static void guardarAccionEnHistorial(String descripcion) throws SQLException {
        String consulta="INSERT INTO HISTORIAL(Descripcion,Fecha) VALUES(?,?)";
        PreparedStatement sentencia =Conexion.getConexion().prepareStatement(consulta);
        sentencia.setString(1, descripcion);
        sentencia.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
        sentencia.execute();
    }

    public static void guardarAccion(String descripcion) throws SQLException{
        guardarAccionParaUsuario(descripcion);
        guardarAccionEnHistorial(descripcion);
    }
    
}
