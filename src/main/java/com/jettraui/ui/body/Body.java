/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.body;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;

/**
 *
 * @author avbravo
 */
public class Body extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public Body() {

        super("body");

    }

    public Body add(WebComponent webComponent) {
        if (webComponent != null) {
            withChild(webComponent);
        }

        return this;
    }

 public Body text(String text) {
        withText(text);
        return this;
    }

    public Body addClass(String styleClass) {
        withClass(styleClass);
        return this;
    }

    public Tag build() {
        return this;
    }

}
