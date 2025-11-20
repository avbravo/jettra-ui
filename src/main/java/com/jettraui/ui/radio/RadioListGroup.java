/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.radio;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.css.RadioListGroupCss;
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
public class RadioListGroup extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public RadioListGroup(List<RadioElement> radioListGroupElements) {
        super("ul");
        withClass(RadioListGroupCss.UL.css);

        if (radioListGroupElements == null || radioListGroupElements.isEmpty()) {
        } else {
            for (RadioElement rge : radioListGroupElements) {
                add(
                        new Li(RadioListGroupCss.LI.css)
                                .add(
                                        new Div(RadioListGroupCss.DIV.css)
                                                .add(rge.radioItem())
                                                .add(rge.label())
                                )
                );
            }
        }
    }

    public RadioListGroup addClass(String styleClass) {
        withClass(styleClass);
        return this;
    }

    public RadioListGroup add(Label label) {
        if (label != null) {
            withChild(label);
        }

        return this;
    }

    public RadioListGroup add(RadioItem radioItem) {

        if (radioItem != null) {
            withChild(radioItem);
        }

        return this;
    }

    public Tag build() {
        return this;
    }

}
