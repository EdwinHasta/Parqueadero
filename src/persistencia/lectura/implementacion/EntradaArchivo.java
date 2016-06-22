/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.lectura.implementacion;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import persistencia.lectura.especificacion.InterfaceEntrada;

/**
 *
 * @author Edwin
 */
public class EntradaArchivo implements InterfaceEntrada {

    @Override
    public void entrada(String nombreArchivo, ArrayList<Object> datos) {
        if (nombreArchivo.equalsIgnoreCase("ACCESOR")) {
            leerArchivo("usuarios.dat", datos);
        }
        if (nombreArchivo.equalsIgnoreCase("SERVICIO")) {
            leerArchivo("servicio.dat", datos);
        }
        if (nombreArchivo.equalsIgnoreCase("TIPOVEHICULO")) {
            leerArchivo("tiposvehiculos.dat", datos);
        }
        if (nombreArchivo.equalsIgnoreCase("CLIENTE")) {
            leerArchivo("clientes.dat", datos);
        }
        if (nombreArchivo.equalsIgnoreCase("SOLICITUD")) {
            leerArchivo("solicitudes.dat", datos);
        }
    }

    private void leerArchivo(String nombreArchivo, ArrayList<Object> datos) {
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(nombreArchivo));
            ois = new ObjectInputStream(bis);
            // Objeto de la clase que se quiere obtener.
            Object p = ois.readObject();
            while (true) {
                datos.add(p);
                // Objeto de la clase que se quiere obtener.
                p = ois.readObject();
            }
        } catch (EOFException ex) {
            try {
                System.out.println("Fin del archivo");
                ois.close();
                bis.close();
            } catch (IOException ex1) {
                System.out.println("Error cerrando el archivo");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("No encontró el archivo.");
        } catch (IOException ex) {
            System.out.println("Error en entrada y salida.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no encontrada.");
        } finally {
            try {
                ois.close();
                bis.close();
            } catch (IOException ex) {
                System.out.println("Error cerrando el archivo f2");
            } catch (NullPointerException npe) {
                System.out.println("Error cerrando el archivo f2 null");
            }
        }
    }

}
