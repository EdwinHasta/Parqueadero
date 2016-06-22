/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlacceso;

import accesosistema.decorador.implementacion.Sesion;
import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public class ManejadorSesiones {
    private static ArrayList<Sesion> sesiones;
    private static ManejadorSesiones instancia;

    private ManejadorSesiones() {
    }
    public static ManejadorSesiones getInstancia(){
        if (instancia == null){
            instancia = new ManejadorSesiones();
        }
        return instancia;
    }
    public void adicionarSesion(Sesion sesion){
        sesiones.add(sesion);
    }
    public boolean verificarSesion(Sesion sesion){
        boolean existe = false;
        for(int i=0; i<sesiones.size(); i++){
            if (sesion == sesiones.get(i) ){
                existe = true;
                i = sesiones.size();
            }
        }
        return existe;
    }
    public String verificarEstadoSesion(Sesion sesion){
        String estado = "";
        for(int i=0; i<sesiones.size(); i++){
            if (sesion == sesiones.get(i) ){
                estado = sesiones.get(i).getEstado();
                i = sesiones.size();
            }
        }
        return estado;
    }
}
