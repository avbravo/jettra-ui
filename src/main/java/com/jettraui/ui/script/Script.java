/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.script;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.script.ScriptUtil;

/**
 *
 * @author avbravo
 */
public class Script extends Tag{
    
    /**
     * Color red, blue
     * @param tagName
     * @param color 
     */
    public Script() {
        
        super("script");
        
        
    }
    public Script(String src) {
        
        super("script");
         withAttribute("src", src);
        
    }

     public Script closeModal(String modal, String function){
         withText(ScriptUtil.closeModal(modal, function));

        return this;
    }
     public Script code(String code){
         withText(code);

        return this;
    }
     public Script src(String src){
     withAttribute("src", src);

        return this;
    }
 
  
     public Tag build(){
      return this;
   }
    
}
