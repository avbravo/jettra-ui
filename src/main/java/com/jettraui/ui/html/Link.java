/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.html;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;

/**
 *
 * @author avbravo
 */
public class Link extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public Link() {

        super("link");

    }

    public Link add(WebComponent webComponent) {
     if (webComponent!= null) {
         withChild(webComponent);
        }

        return this;
    }
  
    
     public Link rel(String rel) {
        withAttribute("rel", rel);
        return this;
    }
     public Link href(String href) {
        withAttribute("href", href);
        return this;
    }
    

     
     
    public Tag build() {
        return this;
    }

}
