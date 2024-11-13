/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author altoc
 */
public class CuentaBancaria {
    
     private double saldo;

    
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial; 
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad; 
            System.out.println("Se han depositado " + cantidad + ". Nuevo saldo: " + saldo);
        }
        
    }

    // Método para mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo); 
    }
}