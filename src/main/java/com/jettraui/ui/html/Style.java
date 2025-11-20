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
public class Style extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public Style() {

        super("style");

    }

  public Style text(String text) {
        withText(text);
        return this;
    }
    

     
     
    public Tag build() {
        return this;
    }

}
