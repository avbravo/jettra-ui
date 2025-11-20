/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.headings;

import com.jettraui.ui.core.Tag;

/**
 *
 * @author avbravo
 */
public class H1 extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public H1() {

        super("h1");

    }
    public H1(String text) {

        super("h1");
    withText(text);
    }

    
    public H1 addClass(String styleClass) {

        withClass(styleClass);
        return this;
    }
    public H1 text(String text) {
        withText(text);
        return this;
    }
    public H1 style(String style) {
         withAttribute("style", style);

        return this;
    }
   
    public Tag build() {
        return this;
    }

}
