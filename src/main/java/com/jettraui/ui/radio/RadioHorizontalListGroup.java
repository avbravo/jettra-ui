/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.radio;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.css.RadioHorizontalListGroupCss;
import com.jettraui.ui.div.Div;
import com.jettraui.ui.html.Label;
import com.jettraui.ui.html.Li;
import com.jettraui.ui.radio.element.RadioElement;
import com.jettraui.ui.radio.item.RadioItem;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class RadioHorizontalListGroup extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public RadioHorizontalListGroup(List<RadioElement> radioListGroupElements) {
        super("ul");
        withClass(RadioHorizontalListGroupCss.UL.css);

        if (radioListGroupElements == null || radioListGroupElements.isEmpty()) {
        } else {
            for (RadioElement rge : radioListGroupElements) {
                add(
                        new Li(RadioHorizontalListGroupCss.LI.css)
                                .add(
                                        new Div(RadioHorizontalListGroupCss.DIV.css)
                                                .add(rge.radioItem())
                                                .add(rge.label())
                                )
                );
            }
        }
    }

    public RadioHorizontalListGroup addClass(String styleClass) {
        withClass(styleClass);
        return this;
    }

    public RadioHorizontalListGroup add(Label label) {
        if (label != null) {
            withChild(label);
        }

        return this;
    }

    public RadioHorizontalListGroup add(RadioItem radioItem) {

        if (radioItem != null) {
            withChild(radioItem);
        }

        return this;
    }

    public Tag build() {
        return this;
    }

}
