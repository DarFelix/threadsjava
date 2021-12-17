/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Random;

/**
 *
 * @author LenovoZ470
 */
public class VentaCon extends Thread{
    
    private static final int Size = 90_000;
    int [] A = new int [Size];
    int [] B = new int [Size];
    int [] C = new int [Size];
    private String nombre;
    
    public VentaCon(){
        
    }
    
     public VentaCon (String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre() {
		return nombre;
	}
            
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    @Override
    public void run(){
        for(int i=0;i<A.length;i++){
			A[i] = new Random().nextInt(1000);
            System.out.println("Venta No."+this.nombre+"Posicion No. "+(i+1)+". Vector A: "+A[i]);
                        
                        
		}
        
        for(int i=0;i<B.length;i++){
			B[i] = new Random().nextInt(1000);
            System.out.println("Venta No."+this.nombre+"Posicion No. "+(i+1)+". Vector B: "+B[i]);
                        
                        
		}
        
        for(int i=0;i<C.length;i++){

                    if (A[i]==B[i]){
                         C[i]=A[i];
                    }else if(A[i]<B[i]){
                         C[i]  = 2*(B[i]-A[i]);
                    }else if(A[i]>B[i]){
                         C[i]=B[i];
                    }
                    
            System.out.println("Venta No."+this.nombre+"Posicion No. "+(i+1)+". Vector C: "+C[i]);
                 
                }
        
        
        int mayor = B[0];
                for (int i = 1; i < B.length; i++) {
			if (B[i] > mayor) {
				mayor = B[i];
                               
			}
                
	}
                int pos = -1;
                for (int i = 1; i < B.length; i++) {
                    if(mayor == B[i]){
                        pos=i+1;
                         System.out.println("El valor del mayor pedido es: " + mayor+" de la venta No."+this.nombre+". Esta en la posición "+pos);
                    }
                   
                }
        
    }
    
    
    
}
