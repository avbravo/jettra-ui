/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.radio;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.css.RadioBorderCss;
import com.jettraui.ui.html.Label;
import com.jettraui.ui.radio.item.RadioItem;

/**
 *
 * @author avbravo
 */
public class RadioBorder extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public RadioBorder() {
        super("div");
        withClass(RadioBorderCss.Div.css);

    }

    public RadioBorder addClass(String styleClass) {
        withClass(styleClass);
        return this;
    }

    public RadioBorder add(Label label) {
        if (label != null) {
            withChild(label);
        }
        return this;
    }

    public RadioBorder add(RadioItem radioItem) {
        if (radioItem != null) {
            withChild(radioItem);
        }
        return this;
    }

    public Tag build() {
        return this;
    }

}
