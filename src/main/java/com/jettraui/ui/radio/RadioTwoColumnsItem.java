/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.radio;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.css.RadioTwoColumnsCss;
import com.jettraui.ui.div.Div;
import com.jettraui.ui.html.Label;
import com.jettraui.ui.radio.element.RadioElement;
import com.jettraui.ui.radio.item.RadioItem;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class RadioTwoColumnsItem extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public RadioTwoColumnsItem(String id, String title, List<RadioElement> radioElements) {
        super("div");
        withClass(RadioTwoColumnsCss.Div.css);

        if (radioElements == null || radioElements.isEmpty()) {
        } else {
            for (RadioElement rge : radioElements) {
                add(
                        new Div(RadioTwoColumnsCss.DivRow.css)
                                .add(
                                        rge.radioItem()
                                )
                                .add(rge.label())
                );

            }
        }
    }
public RadioTwoColumnsItem id(String id) {
        withAttribute("id", id);
        return this;
    }
    public RadioTwoColumnsItem addClass(String styleClass) {
        withClass(styleClass);
        return this;
    }

    public RadioTwoColumnsItem add(Label label) {
        if (label != null) {
            withChild(label);
        }

        return this;
    }

    public RadioTwoColumnsItem add(RadioItem radioItem) {

        if (radioItem != null) {
            withChild(radioItem);
        }

        return this;
    }

    public Tag build() {
        return this;
    }

}
