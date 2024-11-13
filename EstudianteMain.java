/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller4;

/**
 *
 * @author altoc
 */
public class EstudianteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //esta es la instancia
        Estudiante estudiante = new Estudiante( "Jonathan Tobon", 24, 4.5);
        
        // estas son las 3 propiedades asignadas a la clase Estudiante
        System.out.println("Nombre: "+estudiante.getNombre());
        System.out.println("Edad: "+estudiante.getEdad());
        System.out.println("Nota: "+estudiante.getNotaPromedio());
    }
    
}
