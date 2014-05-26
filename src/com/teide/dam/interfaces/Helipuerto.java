/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.interfaces;

import java.util.*;

/**
 *
 * @author DAM1
 */
public class Helipuerto {

    private ArrayList<Volador> listado= new ArrayList<>();
    int pos;

    public void añadir(Volador v) {
      listado.add(v);
    }

    public boolean eliminar(int pos) { 
        if(listado.size()<pos){
            return false;
        }else{
            listado.remove(pos);
            return true;
        }
    }

    
    public String aterrizar(int pos,int metros){
        if(listado.size()>pos){
            return listado.get(pos).aterrizar(metros);
       
        }
    return "el volador numero " +pos+ "acaba aterrizar despues de volar " + metros;

    }
    
    public String despegar(int pos){
        
   if(listado.size()>pos){
            return listado.get(pos).despegar();

    }
}
}