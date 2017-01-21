/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegradorfase1;

/**
 *
 * @author educacionit
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo(100, 50,10);
        System.out.println(v.mostrarVehiculo());
        
        Persona p = new Persona ("Maria", "Ibañez","31044312" );
        System.out.println(mostrarPersona());
        
    }
}
