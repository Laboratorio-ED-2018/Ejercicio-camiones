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
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Un segundo comentario
        Business business = new Business();
        business.printCargo();
        business.printPassengers();
        business.changeCapacity("ABC");
        business.printPassengerTrucksByBrand();
        business.printTotalCargo();
    }
   
    
}
