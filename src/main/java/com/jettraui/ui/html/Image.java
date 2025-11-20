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
public class Image extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public Image() {

        super("img");

    }

   
   
  public Image addClass(String styleClass) {
      withClass(styleClass);
        return this;
    }


    public Image style(String style) {
        withAttribute("style", style);
        return this;
    }
    public Image src(String src) {
        withAttribute("src", src);
        return this;
    }
    public Image id(String id) {
        withAttribute("id", id);
        return this;
    }
    public Image width(String width) {
        withAttribute("width", width);
        return this;
    }
   
    public Image height(String height) {
        withAttribute("height", height);
        return this;
    }
    public Image alt(String alt) {
        withAttribute("alt", alt);
        return this;
    }
   

    public Tag build() {
        return this;
    }

}
