/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipovehiculo.fabrica.implementacion;

import capturadatos.EntradaConsola;
import capturadatos.EntradaDatos;
import tipovehiculo.producto.implementacion.Bicicleta;
import tipovehiculo.producto.interfaz.TipoVehiculo;
import tipovehiculo.fabrica.interfaz.FabricaTipoVehiculo;

/**
 *
 * @author Edwin
 */
public class FabricaBicicleta implements FabricaTipoVehiculo{

    @Override
    public TipoVehiculo crearVehiculo() {
        EntradaDatos ed = new EntradaConsola();
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setNombre(ed.leer("Ingrese nombre de la Bicicleta"));
        try {
            bicicleta.setTarifa(Double.parseDouble(ed.leer("Ingrese la tarifa para la bicicleta")));
        } catch (NumberFormatException nfe) {
            ed.mostrar("Error en el valor de la tarifa de la bicicleta.");
        }
        return bicicleta;
    }
    
}
