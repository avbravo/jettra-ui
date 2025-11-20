/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.radio.header;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.css.type.CssType;
import com.jettraui.ui.headings.H3;
import com.jettraui.ui.html.Label;

/**
 *
 * @author avbravo
 */
public class RadioHeader extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public RadioHeader(String title, CssType cssType) {
        super("h3");
        add(new H3(title).addClass(getCssTypeH3Services().toCss(cssType)));


    }

   
    public RadioHeader addClass(String styleClass) {
        withClass(styleClass);
        return this;
    }

    public RadioHeader add(Label label) {
        if (label != null) {
            withChild(label);
        }

        return this;
    }

    public Tag build() {
        return this;
    }

}
