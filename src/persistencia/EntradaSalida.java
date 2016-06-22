/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import persistencia.escritura.especificacion.InterfaceSalida;
import persistencia.escritura.implementacion.SalidaArchivo;
import persistencia.lectura.especificacion.InterfaceEntrada;
import persistencia.lectura.implementacion.EntradaArchivo;


/**
 *
 * @author Edwin
 */
public class EntradaSalida {

    public EntradaSalida() {
    }
    
    public void procesar(String tipo, String archivo, ArrayList<Object> datos){
           if (tipo.equalsIgnoreCase("GUARDAR")){
               InterfaceSalida is = new SalidaArchivo();
               is.salida(archivo, datos);
           }
           if (tipo.equalsIgnoreCase("LEER")){
               InterfaceEntrada is = new EntradaArchivo();
               is.entrada(archivo, datos);
           }
    }
}
