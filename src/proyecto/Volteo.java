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
public class Volteo extends Camion {
    int toneladas;

    public Volteo(String marca, String motor, String placas, int toneladas) {
        super(marca, motor, placas);
        this.toneladas = toneladas;
    }
}
