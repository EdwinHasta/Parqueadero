/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import capturadatos.EntradaConsola;
import capturadatos.EntradaDatos;
import java.util.ArrayList;
import tipovehiculo.fabrica.implementacion.FabricaBicicleta;
import tipovehiculo.fabrica.implementacion.FabricaCarro;
import tipovehiculo.fabrica.implementacion.FabricaMoto;
import tipovehiculo.producto.interfaz.TipoVehiculo;
import tipovehiculo.fabrica.interfaz.FabricaTipoVehiculo;

/**
 *
 * @author Edwin
 */
public class ClienteVehiculo {

    private static FabricaTipoVehiculo fabVehi;
    private static ArrayList<TipoVehiculo> tiposVehiculos;

    public static TipoVehiculo crearCarro() {
        fabVehi = new FabricaCarro();
        return fabVehi.crearVehiculo();
    }

    public static TipoVehiculo crearMoto() {
        fabVehi = new FabricaMoto();
        return fabVehi.crearVehiculo();
    }

    public static TipoVehiculo crearBicicleta() {
        fabVehi = new FabricaBicicleta();
        return fabVehi.crearVehiculo();
    }

    public static void crearTiposVehiculos() {
        tiposVehiculos = new ArrayList<>();
        tiposVehiculos.add(crearCarro());
        tiposVehiculos.add(crearMoto());
        tiposVehiculos.add(crearBicicleta());
    }

    public static void main(String[] args) {
        EntradaDatos ed = new EntradaConsola();
        crearTiposVehiculos();
        ed.mostrar("Vehiculos creados");
        for (TipoVehiculo v : tiposVehiculos) {
            ed.mostrarLinea(v.getNombre()+" ");
            ed.mostrarLinea("$ "+String.valueOf(v.getTarifa()));
            ed.mostrar("");
        }
    }
}
