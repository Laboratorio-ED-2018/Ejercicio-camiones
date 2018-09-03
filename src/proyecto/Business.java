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
    private Truck[] trucks = new Truck[10];

    public Business() {
        trucks[0] = new Cargo("VW", "1234", "ABC", 10);
        trucks[1] = new Cargo("Volvo", "1235", "ABD", 10);
        trucks[2] = new Cargo("VW", "1236", "ABDC", 10);
        trucks[3] = new Cargo("Mercedes", "1237", "ABDW", 10);
        trucks[4] = new Cargo("Volvo", "1238", "ABDS", 10);
        trucks[5] = new Passengers("VW", "533434", "AJSJ", 5);
        trucks[6] = new Passengers("Mercedes", "553434", "AQSJ", 5);
        trucks[7] = new Passengers("Volvo", "5433434", "AJEJ", 5);
        trucks[8] = new Passengers("Volvo", "533734", "AJLJ", 5);
        
        
    }
    
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
