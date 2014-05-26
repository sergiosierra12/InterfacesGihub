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
    
    Scanner s = new Scanner(System.in);
     
     int pos;
    
    public  void añadir (Volador){
                Volador v = new Volador();
        if (tabla.containsKey(p)) {
            return false;
        }        
    }
    
    public boolean eliminar(int pos){
        
      

          
       
       
          
        return true ;
        
        
    }
    public String aterrizas(int pos, int metros){
        
      
        
       return "el volador " +pos+"ha volado " + metros+" metros " ;
    }
    public String despegar(int pos){
        
        
        
       return "el volador numero " +pos+ "acaba de iniciar el despegue";
    }

}
