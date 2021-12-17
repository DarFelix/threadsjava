/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
/**
 *
 * @author LenovoZ470
 */

public class Main {
    public static void main(String[] args){
        
        long inicio = System.currentTimeMillis();
        
        
        VentaSin v1 = new VentaSin(" 1 ");
        v1.llenarA();
        v1.llenarB();
        v1.llenarC();
        v1.mayorPedido();
        
        VentaSin v2 = new VentaSin(" 2 ");
        v2.llenarA();
        v2.llenarB();
        v2.llenarC();
        v2.mayorPedido();
        
        long fin = System.currentTimeMillis();
        long total = fin-inicio;
        System.out.println("El programa demoro "+ total + " ms.");
    }
    
}
