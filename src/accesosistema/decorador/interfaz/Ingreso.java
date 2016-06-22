/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosistema.decorador.interfaz;

import accesosistema.componente.interfaz.Accesor;
import java.io.Serializable;

/**
 *
 * @author Edwin
 */
public abstract class Ingreso implements Accesor, Serializable{
    private Accesor accesor;

    public Ingreso(Accesor accesor) {
        this.accesor = accesor;
    }

    public Accesor getAccesor() {
        return accesor;
    }

    public void setAccesor(Accesor accesor) {
        this.accesor = accesor;
    }
    public abstract void ingresar();
}
