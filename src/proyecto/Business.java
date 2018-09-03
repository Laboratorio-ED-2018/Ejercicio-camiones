/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;


/**
 *
 * @author ICABOA
 */
public class Business {
    Truck[] trucks = new Truck[10];
    
    public void printPassengers() {
        StringBuilder sb = new StringBuilder();
        for (Truck camion : trucks) {
            if (camion instanceof Passengers) {
                sb.append(camion.toString());
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
    
    public void printCargo() {
        StringBuilder sb = new StringBuilder();
        for (Truck camion : trucks) {
            if (camion instanceof Cargo) {
                sb.append(camion.toString());
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
    
    public void changeCapacity(String plates) {
        for (Truck truck : trucks) {
            if (truck instanceof Cargo && truck.getPlates().equals(plates)) {
                Scanner scan = new Scanner(System.in);
                System.out.println("¿Cuál es la nueva capacidad?");
                ((Cargo) truck).setCargo(scan.nextInt());
            }
        }
    }
    
    
}
