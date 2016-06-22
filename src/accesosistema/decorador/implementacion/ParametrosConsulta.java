/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosistema.decorador.implementacion;

import accesosistema.componente.interfaz.Accesor;
import accesosistema.decorador.interfaz.Ingreso;
import capturadatos.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Edwin
 */
public class ParametrosConsulta extends Ingreso{
    private Calendar fechaDesde;
    private Calendar fechaHasta;

    public ParametrosConsulta(Accesor accesor) {
        super(accesor);
        fechaDesde = Calendar.getInstance();
        fechaHasta = Calendar.getInstance();
    }

    public Calendar getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Calendar fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Calendar getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Calendar fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    

    @Override
    public void ingresar() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");	
        getAccesor().ingresar();
        EntradaDatos ed = new EntradaConsola();
        ed.mostrarLinea("con fecha desde: "+sdf.format(fechaDesde.getTime())+" y fecha hasta: "+sdf.format(fechaHasta.getTime()) +".");
    }
    
}
