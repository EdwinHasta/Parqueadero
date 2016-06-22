/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipovehiculo.producto.implementacion;

import java.io.Serializable;
import tipovehiculo.producto.interfaz.TipoVehiculo;

/**
 *
 * @author Edwin
 */
public class Carro implements TipoVehiculo,Serializable{
    private String nombre;
    private double tarifa;

    public Carro() {
    }

    public Carro(String nombre, double tarifa) {
        this.nombre = nombre;
        this.tarifa = tarifa;
    }
    
    @Override
    public double getTarifa() {
        return this.tarifa;
    }
    @Override
    public void setTarifa(double tarifa){
        this.tarifa = tarifa;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
       this.nombre = nombre;
    }
    
}
