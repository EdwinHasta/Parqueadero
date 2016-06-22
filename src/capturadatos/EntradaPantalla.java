/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capturadatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Edwin
 */
public class EntradaPantalla implements EntradaDatos{

    @Override
    public String leer(String mensaje) {
        JOptionPane.showMessageDialog(null, "No soportado");
        return null;
    }

    @Override
    public void mostrar(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    @Override
    public void mostrarLinea(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
