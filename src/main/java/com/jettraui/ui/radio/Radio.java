/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.radio;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.css.RadioCss;
import com.jettraui.ui.html.Label;
import com.jettraui.ui.radio.item.RadioItem;

/**
 *
 * @author avbravo
 */
public class Radio extends Tag {


    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public Radio() {
        super("div");
        withClass(RadioCss.Div.css);

    }
  

    public Radio addClass(String styleClass) {
        withClass(styleClass);
        return this;
    }

    public Radio add(Label label) {
        if (label != null) {
            withChild(label);
        }

        return this;
    }

    public Radio add(RadioItem radioItem) {

        if (radioItem != null) {
            withChild(radioItem);
        }

        return this;
    }

   
    

    public Tag build() {
        return this;
    }

   

}
