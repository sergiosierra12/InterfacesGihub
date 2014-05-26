/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.interfaces;

/**
 *
 * @author DAM1
 */
public class Helicoptero implements Volador{

    @Override
    public String despegar() {
         return " el helicoptero ha despegado " ;  
    }

    @Override
    public String aterrizar(int metros) {
       return "el helicoptero ha aterrizado a un coste de " +(0.75*metros)+"€";   
    }
    
}
