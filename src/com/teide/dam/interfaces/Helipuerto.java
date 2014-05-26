/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.interfaces;

import java.util.ArrayList;

/**
 *
 * @author DAM1
 */
public class Helipuerto {

    private ArrayList<Volador> listado;
    int pos;

    public void añadir(Volador) {
            listado.add(Volador);
    }

    public boolean eliminar(int pos) { 
        if(listado.size()<pos){
            return false;
        }else{
            listado.remove(pos);
            return true;
        }
    }

    public String aterrizar(int pos, int metros) {
          
    }

    public String despegar(int pos) {
    }
}
