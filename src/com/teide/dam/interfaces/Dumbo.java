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
     return "Dumbo ha despegadovelozmente " ;  
    }

    @Override
    public String aterrizar(int metros) {
    return "Dumbo ha aterrizado a un coste de " +(0.85*metros)+"€";   
    }
    
}
