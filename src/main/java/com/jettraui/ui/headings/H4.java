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
public class H4 extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public H4() {

        super("h4");

    }
    
       public H4(String text) {

        super("h4");
    withText(text);
    }
    
        public H4 addClass(String styleClass) {

        withClass(styleClass);
        return this;
    }

    public H4 text(String text) {
        withText(text);
        return this;
    }
  public H4 style(String style) {
         withAttribute("style", style);

        return this;
    }

    public Tag build() {
        return this;
    }

}
