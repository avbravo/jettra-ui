/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.formatting;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;

/**
 *
 * @author avbravo
 */
public class Sub extends Tag{
    
    /**
     * Color red, blue
     * @param tagName
     * @param color 
     */
    public Sub() {
        
        super("sub");
           
    }
       public Sub add(WebComponent webComponent) {
        if (webComponent != null) {
            withChild(webComponent);
        }

        return this;
    }
 
   public Tag build(){
      return this;
   }
    
}
