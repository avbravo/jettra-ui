/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.head;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;
import com.jettraui.ui.html.Meta;

/**
 *
 * @author avbravo
 */
public class Head extends Tag {

   
    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public Head() {

        super("head");

    }

    public Head add(WebComponent webComponent) {
     if (webComponent!= null) {
         withChild(webComponent);
        }

        return this;
    }
    
    
    public Tag build() {
        return this;
    }

}
