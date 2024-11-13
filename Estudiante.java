/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author altoc
 */
public class Estudiante {
    
    
    private String nombre;
    private int edad;
    private double notaPromedio;

    //se usa el set en el contructor para que las condiciones (if y else) no se repitan y sean redundante en el codigo
    public Estudiante(String nombre, int edad, double notaPromedio){
        setNombre(nombre);
        setEdad (edad);
        setNotaPromedio(notaPromedio);
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    //validacion en el set
    public void setNombre(String nombre) {
        if(nombre!=null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
          }else{
                System.out.println("Error: El nombre no puede estar vacio.");    }
    }

    public int getEdad() {
        return edad;
    }
    
      //validacion en el set
    public void setEdad(int edad) {
       if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor que 0.");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }
    
      //validacion en el set
    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 5) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: La nota promedio debe estar entre 0 y 5.");
        }
    }
}
