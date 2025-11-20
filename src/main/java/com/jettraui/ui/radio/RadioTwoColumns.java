/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.radio;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.html.FieldSet;
import com.jettraui.ui.html.Label;
import com.jettraui.ui.radio.element.RadioElement;
import com.jettraui.ui.radio.item.RadioItem;
import java.util.List;


/**
 *
 * @author avbravo
 */
public class RadioTwoColumns extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public RadioTwoColumns(String id, String title, List<RadioElement> radioElements) {
        super("div");
        //withClass(RadioTwoColumnsCss.Div.css);
        withAttribute("id", id);
        add(new FieldSet().text(title));
        add(new RadioTwoColumnsItem(id, title, radioElements));

    }

    public RadioTwoColumns id(String id) {
        withAttribute("id", id);
        return this;
    }

    public RadioTwoColumns addClass(String styleClass) {
        withClass(styleClass);
        return this;
    }

    public RadioTwoColumns add(Label label) {
        if (label != null) {
            withChild(label);
        }

        return this;
    }

    public RadioTwoColumns add(RadioItem radioItem) {

        if (radioItem != null) {
            withChild(radioItem);
        }

        return this;
    }

    public Tag build() {
        return this;
    }

}
