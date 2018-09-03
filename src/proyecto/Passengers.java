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
public class Passengers extends Truck {
    private int passengers;

    public Passengers(String brand, String motor, String plates, int passengers) {
        super(brand, motor, plates);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Pasajeros{" + "pasajeros=" + passengers + '}';
    }
    
}
