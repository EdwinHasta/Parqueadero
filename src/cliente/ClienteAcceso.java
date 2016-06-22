/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import accesosistema.componente.implementacion.Usuario;
import accesosistema.decorador.implementacion.ParametrosConsulta;
import accesosistema.decorador.implementacion.Sesion;

/**
 *
 * @author Edwin
 */
public class ClienteAcceso {
    public static void main(String[] args){
        Usuario usuario = new Usuario("Edwin", "Administrador","pwd");
        ParametrosConsulta pConsulta= new ParametrosConsulta(usuario);
        pConsulta.ingresar();
        /*Sesion sesion = new Sesion(pConsulta);
        sesion.ingresar();
        System.out.println();*/
    }
}
