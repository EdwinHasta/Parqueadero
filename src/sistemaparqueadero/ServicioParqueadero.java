/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaparqueadero;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Edwin
 */
public class ServicioParqueadero implements Serializable{
    private String titulo;
    private String sector;
    
    private static ServicioParqueadero instancia;
    
    private ServicioParqueadero() {
    }

    public static ServicioParqueadero getInstancia(String titulo) {
        if (instancia==null){
            instancia = new ServicioParqueadero();
            instancia.titulo = titulo;
        }
        return instancia;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

}
