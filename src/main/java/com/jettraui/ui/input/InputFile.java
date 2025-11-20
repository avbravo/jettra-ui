/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.input;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.css.type.CssType;

/**
 *
 * @author avbravo
 */
public class InputFile extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public InputFile() {

        super("input");
        withAttribute("type", "file");

    }

    public InputFile(String id, String name, String styleClass) {

        super("input");
        withAttribute("type", "file");
        withAttribute("id", id);
        withAttribute("name", name);
        if (styleClass == null || styleClass.equals("")) {

        } else {
            withClass(styleClass);
        }

    }
    public InputFile(String id, String name, CssType cssType) {

        super("input");
        withAttribute("type", "file");
        withAttribute("id", id);
        withAttribute("name", name);
       
      withClass(getCssTypeInputServices().toCss(cssType));
     

    }

 
    public InputFile text(String text) {
        withText(text);
        return this;
    }

    public InputFile accept(String accept) {
        withAttribute("id", accept);
        return this;
    }

    public InputFile id(String id) {
        withAttribute("id", id);
        return this;
    }

    public InputFile name(String name) {
        withAttribute("name", name);
        return this;
    }

    public InputFile addClass(String withClass) {
        withClass(withClass);
        return this;
    }

    public InputFile placeholder(String placeholder) {
        withAttribute("placeholder", placeholder);
        return this;
    }

    public InputFile value(String value) {
        withAttribute("value", value);
        return this;
    }

    public InputFile step(String step) {
        withAttribute("step", step);
        return this;
    }

    public InputFile readonly(Boolean readonly) {
        if (readonly) {
            withAttribute("readonly", "");
        }

        return this;
    }

    public InputFile required(Boolean required) {
        if (required) {
            withAttribute("required", "true");
        }

        return this;
    }

    public Tag build() {
        return this;
    }

}
