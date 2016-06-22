/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capturadatos;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class EntradaConsola implements EntradaDatos{

    @Override
    public String leer(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        String entrada = sc.next();
        return entrada;
    }

    @Override
    public void mostrar(String texto) {
        System.out.println(texto);
    }
    @Override
    public void mostrarLinea(String texto) {
        System.out.print(texto);
    }
}
