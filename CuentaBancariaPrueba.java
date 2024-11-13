/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller4;

/**
 *
 * @author altoc
 */
public class CuentaBancariaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       CuentaBancaria cuenta = new CuentaBancaria(500000);
        
        
       // intente visualizar directamente el atributo saldo y no me lo permitio porque es private
       //System.out.println(cuenta.saldo);
       
       
       
        // Mostrar saldo inicial
        cuenta.mostrarSaldo(); 
        
       
        cuenta.depositar(600000); 
        cuenta.mostrarSaldo();     

       // al tener el get podia visualizar el saldo desde esta clase sin problema
       // al tener el set podia modificar el saldo desdde esta clase sin problema
       // al usar los metodos depositar y mostrarSaldo igualmente pude visualizar y editar el private.
       
    }
}
