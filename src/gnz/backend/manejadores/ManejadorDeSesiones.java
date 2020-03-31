/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnz.backend.manejadores;

import gnz.backend.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author jesfrin
 */
public class ManejadorDeSesiones {

    public static void guardarSesion(String user) throws SQLException {
        String consulta = "INSERT INTO SESION(Fecha,USUARIO_User) VALUES(?,?)";
        PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
        sentencia.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
        sentencia.setString(2, user);
        sentencia.execute();
    }
    
    public static int consultarUltimaSesion() throws SQLException{
        String consulta="SELECT COUNT(*) FROM SESION";
        PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
        ResultSet rs= sentencia.executeQuery();
        while(rs.next()){
            return rs.getInt(1);
        }
        return 0;
    }

}
