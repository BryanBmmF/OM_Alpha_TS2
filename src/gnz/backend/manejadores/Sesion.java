/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnz.backend.manejadores;

import java.sql.Timestamp;

/**
 *
 * @author jesfrin
 */
public class Sesion {
    
        private int idSesion;
    private Timestamp fecha;
    private String usuario;

    public Sesion(int idSesion, Timestamp fecha, String usuario) {
        this.idSesion = idSesion;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public Sesion() {
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
