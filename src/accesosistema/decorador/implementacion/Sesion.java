/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosistema.decorador.implementacion;

import accesosistema.componente.interfaz.Accesor;
import accesosistema.decorador.interfaz.Ingreso;
import capturadatos.*;

/**
 *
 * @author Edwin
 */
public class Sesion extends Ingreso{

    private String estado;
    
    public Sesion(Accesor accesor) {
        super(accesor);
        estado="ABIERTA";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public void ingresar() {
        getAccesor().ingresar();
        EntradaDatos ed = new EntradaConsola();
        ed.mostrarLinea(" Y con la sesion "+estado.toLowerCase());
    }
}
