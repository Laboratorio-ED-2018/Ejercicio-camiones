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
public class Truck {
    private String brand;
    private String motor;
    private String plates;

    public Truck(String marca, String motor, String placas) {
        this.brand = marca;
        this.motor = motor;
        this.plates = placas;
    }

    public String getBrand() {
        return brand;
    }

    public String getMotor() {
        return motor;
    }
    
    public String getPlates() {
        return plates;
    }

    @Override
    public String toString() {
        return "Camion{" + "marca=" + brand + ", motor=" + motor + ", placas=" + plates + '}';
    }
    
    
}
