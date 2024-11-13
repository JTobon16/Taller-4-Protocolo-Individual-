/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller4;

/**
 *
 * @author altoc
 */
public class CocheMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Coche coche = new Coche("Toyota", "Corolla", 180);

        
        // System.out.println(coche.marca);  // Error
        // System.out.println(coche.modelo);  // Error
        // System.out.println(coche.velocidadMaxima);  // Error

        coche.acelerar(20);
        coche.acelerar(-10);
     
        
        System.out.println("La velocidad maxima es: " + coche.getVelocidadMaxima());
       
    }
}
    
    

