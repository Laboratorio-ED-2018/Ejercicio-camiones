/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author ICABOA
 */
public class Pasajeros extends Camion {
    int pasajeros;

    public Pasajeros(String marca, String motor, String placas, int pasajeros) {
        super(marca, motor, placas);
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return super.toString() + "Pasajeros{" + "pasajeros=" + pasajeros + '}';
    }
    
}
