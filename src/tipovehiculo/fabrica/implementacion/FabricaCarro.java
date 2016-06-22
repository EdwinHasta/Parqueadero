/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipovehiculo.fabrica.implementacion;

import capturadatos.EntradaConsola;
import capturadatos.EntradaDatos;
import tipovehiculo.producto.implementacion.Carro;
import tipovehiculo.producto.interfaz.TipoVehiculo;
import tipovehiculo.fabrica.interfaz.FabricaTipoVehiculo;

/**
 *
 * @author Edwin
 */
public class FabricaCarro implements FabricaTipoVehiculo {

    @Override
    public TipoVehiculo crearVehiculo() {
        EntradaDatos ed = new EntradaConsola();
        Carro carro = new Carro();
        carro.setNombre(ed.leer("Ingrese nombre del carro"));
        try {
            carro.setTarifa(Double.parseDouble(ed.leer("Ingrese la tarifa para el carro")));
        } catch (NumberFormatException nfe) {
            ed.mostrar("Error en el valor de la tarifa del carro.");
        }
        return carro;
    }

}
