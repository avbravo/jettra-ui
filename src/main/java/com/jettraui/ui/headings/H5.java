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
public class H5 extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public H5() {

        super("h5");

    }
       public H5(String text) {

        super("h5");
    withText(text);
    }
    
        public H5 addClass(String styleClass) {

        withClass(styleClass);
        return this;
    }

    public H5 text(String text) {
        withText(text);
        return this;
    }
  public H5 style(String style) {
         withAttribute("style", style);

        return this;
    }
    public Tag build() {
        return this;
    }

}
