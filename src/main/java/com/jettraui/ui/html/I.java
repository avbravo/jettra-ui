/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.html;

import com.jettraui.ui.core.Tag;

/**
 *
 * @author avbravo
 */
public class I extends Tag{
    
    /**
     * Color red, blue
     * @param tagName
     * @param color 
     */
    public I() {
        
        super("i");
           
    }
    
    
  
        
    public I addClass(String styleClass) {
      withClass(styleClass);
        return this;
    }
    
    
   public Tag build(){
      return this;
   }
    
}
