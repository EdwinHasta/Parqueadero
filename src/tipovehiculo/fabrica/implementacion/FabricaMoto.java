/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipovehiculo.fabrica.implementacion;

import capturadatos.EntradaConsola;
import capturadatos.EntradaDatos;
import tipovehiculo.producto.implementacion.Moto;
import tipovehiculo.producto.interfaz.TipoVehiculo;
import tipovehiculo.fabrica.interfaz.FabricaTipoVehiculo;

/**
 *
 * @author Edwin
 */
public class FabricaMoto implements FabricaTipoVehiculo{

    @Override
    public TipoVehiculo crearVehiculo() {
        EntradaDatos ed = new EntradaConsola();
        Moto moto = new Moto();
        moto.setNombre(ed.leer("Ingrese nombre de la moto"));
        try {
            moto.setTarifa(Double.parseDouble(ed.leer("Ingrese la tarifa para la moto")));
        } catch (NumberFormatException nfe) {
            ed.mostrar("Error en el valor de la tarifa de la moto.");
        }
        return moto;
    }
    
}
