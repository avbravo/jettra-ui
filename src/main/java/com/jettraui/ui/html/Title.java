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
public class Title extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public Title() {

        super("title");

    }
    public Title(String text) {

        super("title");
          withText(text);

    }

    public Title text(String text) {
        withText(text);
        return this;
    }

  

    public Tag build() {
        return this;
    }

}
