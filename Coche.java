/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author altoc
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    
    public Coche(String marca, String modelo, int velocidadMaxima){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMaxima=velocidadMaxima;
    }
    
    public void acelerar(int incremento){
        if (incremento>0){
        this.velocidadMaxima+=incremento;
            }else{
                    System.out.println("El incremento es positivo");}
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    
}
