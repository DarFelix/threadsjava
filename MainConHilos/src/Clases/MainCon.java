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
public class MainCon {
     public static void main(String[] args){
         
         long inicio = System.currentTimeMillis();
         
         VentaCon v1 = new VentaCon(" 1 ");
         VentaCon v2 = new VentaCon(" 2 ");
         
         v1.start();
         v2.start();
         
        while(v1.isAlive() || v2.isAlive());
        
    
         
        long fin = System.currentTimeMillis();
        long total = fin-inicio;
        System.out.println("El programa demoro "+ total + " ms.");
         
        
        
     }
}
