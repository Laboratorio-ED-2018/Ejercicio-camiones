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
public class Camion {
    String marca;
    String motor;
    String placas;

    public Camion(String marca, String motor, String placas) {
        this.marca = marca;
        this.motor = motor;
        this.placas = placas;
    }

    @Override
    public String toString() {
        return "Camion{" + "marca=" + marca + ", motor=" + motor + ", placas=" + placas + '}';
    }
    
    
}
