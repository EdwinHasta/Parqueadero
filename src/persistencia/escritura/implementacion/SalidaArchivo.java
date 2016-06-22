/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.escritura.implementacion;

import capturadatos.EntradaDatos;
import capturadatos.EntradaPantalla;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import persistencia.escritura.especificacion.InterfaceSalida;

/**
 *
 * @author Edwin
 */
public class SalidaArchivo implements InterfaceSalida {

    @Override
    public void salida(String nombreArchivo, ArrayList<Object> datos) {
        if (nombreArchivo.equalsIgnoreCase("ACCESOR")) {
            guardarArchivo("usuarios.dat", datos);
        }
        if (nombreArchivo.equalsIgnoreCase("SERVICIO")) {
            guardarArchivo("servicio.dat", datos);
        }
        if (nombreArchivo.equalsIgnoreCase("TIPOVEHICULO")) {
            guardarArchivo("tiposvehiculos.dat", datos);
        }
        if (nombreArchivo.equalsIgnoreCase("CLIENTE")) {
            guardarArchivo("clientes.dat", datos);
        }
        if (nombreArchivo.equalsIgnoreCase("SOLICITUD")) {
            guardarArchivo("solicitudes.dat", datos);
        }
    }

    private void guardarArchivo(String nombreArchivo, ArrayList<Object> datos) {
        BufferedOutputStream bos = null;
        try {
            bos = new BufferedOutputStream(new FileOutputStream(nombreArchivo));
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado.");
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bos);
            if (datos != null) {
                if (!datos.isEmpty()) {
                    for (int i = 0; i < datos.size(); i++) {
                        oos.writeObject(datos.get(i));
                    }
                }
            }
            EntradaDatos ed = new EntradaPantalla();
            ed.mostrar("Archivo " + nombreArchivo + " guardado.");
        } catch (IOException ex) {
            System.out.println("Error 1 guardando el archivo");
        }
        try {
            oos.close();
            bos.close();
        } catch (NullPointerException npe) {
            System.out.println("Cerrando objetos no creados.");
        } catch (IOException ex) {
            System.out.println("Error cerrando los archivos");
        }
    }

}
