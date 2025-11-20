/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.radio;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;
import com.jettraui.ui.css.RadioCss;

/**
 *
 * @author avbravo
 */
public class RadioItemLink extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public RadioItemLink() {

        super("a");

    }

    public RadioItemLink(String href, String text) {

        super("a");
        withAttribute("href", href);
        addClass(RadioCss.Link.css);
    withText(text);
    }

    public RadioItemLink href(String href) {
        withAttribute("href", href);
        return this;
    }

    public RadioItemLink text(String text) {
        withText(text);
        return this;
    }

    public RadioItemLink addClass(String styleClass) {
        withClass(styleClass);
        return this;
    }

    public RadioItemLink add(WebComponent webComponent) {
        if (webComponent != null) {
            withChild(webComponent);
        }

        return this;
    }

    public Tag build() {
        return this;
    }

}
