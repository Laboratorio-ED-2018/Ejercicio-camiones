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
public class Empresa {
    Camion[] camiones;
    
    public void imprimePasajeros() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < camiones.length; i++) {
            Camion camion = camiones[i];
            if (camion instanceof Pasajeros) {
                sb.append(camion.toString());
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
    
    public void imprimeVolteo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < camiones.length; i++) {
            Camion camion = camiones[i];
            if (camion instanceof Volteo) {
                sb.append(camion.toString());
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
