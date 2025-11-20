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
public class Span extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public Span() {

        super("span");

    }
    public Span(String styleClass) {

        super("span");
   withClass(styleClass);
    }

   
    

    public Span text(String text) {
        withText(text);
        return this;
    }
  public Span addClass(String styleClass) {
      withClass(styleClass);
        return this;
    }


    public Span forField(String field) {
        withAttribute("for", field);
        return this;
    }
    public Span id(String id) {
        withAttribute("id", id);
        return this;
    }
   
 public Span add(WebComponent webComponent) {
        if (webComponent != null) {
            withChild(webComponent);
        }

        return this;
    }
    public Tag build() {
        return this;
    }

}
