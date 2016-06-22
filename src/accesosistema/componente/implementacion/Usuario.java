/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosistema.componente.implementacion;

import accesosistema.componente.interfaz.Accesor;
import capturadatos.*;
import java.io.Serializable;

/**
 *
 * @author Edwin
 */
public class Usuario implements Accesor, Serializable{
    private String nombre;
    private String role;
    private String contrasenha;

    public Usuario(String nombre, String role, String pass) {
        this.nombre = nombre;
        this.role = role;
        this.contrasenha = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRole() {
        return role;
    }
    
    public boolean validarContrasenha(String pass){
        return this.contrasenha.equals(pass);
    }
    
    @Override
    public void ingresar() {
        EntradaDatos ed = new EntradaConsola();
        ed.mostrar("El usuario "+nombre+" ha ingresado.");
    }

    @Override
    public String getNombreUsuario() {
        return this.nombre;
    }
}
