/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.escritura.especificacion;

import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public interface InterfaceSalida {
    public void salida(String nombreArchivo, ArrayList<Object> datos);
}
