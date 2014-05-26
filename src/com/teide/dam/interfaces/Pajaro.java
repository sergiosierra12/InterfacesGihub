/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.interfaces;

/**
 *
 * @author DAM1
 */
public class Pajaro implements Volador{
    @Override
    public String despegar() {
     return "El pajaro ha empezado a volar " ;  
    }

    @Override
    public String aterrizar(int metros) {
    return "El pajaro ha aterrizado " +(0.85*metros);   
    }
}
