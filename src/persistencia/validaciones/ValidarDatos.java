/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.validaciones;

import accesosistema.componente.interfaz.Accesor;
import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public class ValidarDatos {
    public boolean verificarExistenciaRegistro(String nombreArchivo, ArrayList<Object> datos, Object dato){
        boolean resultado=false;
        if (nombreArchivo.equalsIgnoreCase("ACCESOR")){
            Accesor objDato = (Accesor) dato;
            Accesor aux;
            for (int i=0; i<datos.size(); i++){
                aux = (Accesor) datos.get(i);
                if (aux.getNombreUsuario().equals(objDato.getNombreUsuario())){
                    resultado=true;
                    i=datos.size();
                }
            }
        }
        return resultado;
    }
}
