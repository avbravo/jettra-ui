/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.quotationandcitation;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;

/**
 *
 * @author avbravo
 */
public class Blockquote extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public Blockquote() {

        super("blockquote");

    }

    public Blockquote cite(String cite) {
       withAttribute("cite", cite);
        return this;
    }

    public Blockquote add(WebComponent webComponent) {
        if (webComponent != null) {
            withChild(webComponent);
        }

        return this;
    }

    public Tag build() {
        return this;
    }

}
