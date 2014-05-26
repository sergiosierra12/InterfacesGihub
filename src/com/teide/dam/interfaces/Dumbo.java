/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.interfaces;

/**
 *
 * @author DAM1
 */
public class Dumbo implements Volador{

    @Override
    public String despegar() {
     return "el avion ha despegado a un coste de " ;  
    }

    @Override
    public String aterrizar(int metros) {
    return "el avion ha aterrizado a un coste de " +(0.85*metros)+"€";   
    }
    
}
