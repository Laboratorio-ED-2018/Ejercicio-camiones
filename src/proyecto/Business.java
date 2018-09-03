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
    
    
    /*
     * imprimir todos los datos de todos los camiones de pasajeros, 
     */
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
    
    /*
     * imprimir todos los datos de todos los camiones de volteo
     */
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
    
    /*
     * dada la placa de un camión de volteo, actualizar su capacidad de 
     * transporte (el usuario indicará la nueva capacidad)
     */
    public void changeCapacity(String plates) {
        for (Truck truck : trucks) {
            if (truck instanceof Cargo && truck.getPlates().equals(plates)) {
                Scanner scan = new Scanner(System.in);
                System.out.println("¿Cuál es la nueva capacidad?");
                ((Cargo) truck).setCargo(scan.nextInt());
            }
        }
    }
    
    /*
     * calcular e imprimir la cantidad total de camiones de pasajeros que sean de una marca
     * específica (el usuario indicará cuál),
     */
    public void printPassengerTrucksByBrand() {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuál es la marca?");
        String brand = scan.next();
        int count = 0;
        for (Truck truck : trucks) {
            if (truck instanceof Passengers && truck.getBrand().equals(brand)) {
                count ++;
            }
        }
        System.out.println("Camiones de pasajeros de la marca " + brand + ": " + count);
    }
    
    /*
     * calcular e imprimir la cantidad total de
     * toneladas de tierra que puede ser transportada simultáneamente (por todos los camiones
     * de volteo de la empresa).
     */
    public void printTotalCargo() {
        int count = 0;
        for (Truck truck : trucks) {
            if (truck instanceof Cargo) {
                count += ((Cargo) truck).getCargo();
            }
        }
        
        System.out.println("Cantidad total de toneladas: " + count);
    }
}
