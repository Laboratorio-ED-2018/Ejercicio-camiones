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
public class Cargo extends Truck {
    private int cargo;

    public Cargo(String brand, String motor, String plates, int cargo) {
        super(brand, motor, plates);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "Volteo{" + "toneladas=" + cargo + '}';
    }
    
    
}
