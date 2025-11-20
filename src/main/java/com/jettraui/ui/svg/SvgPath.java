/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.svg;

import com.jettraui.ui.core.Tag;

/**
 *
 * @author avbravo
 */
public class SvgPath extends Tag {

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public SvgPath() {

        super("path");

    }

    public SvgPath d(String d) {
        withAttribute("d", d);
        return this;
    }

    public SvgPath stroke(String stroke) {
        withAttribute("stroke", stroke);
        return this;
    }

    public SvgPath stroke_linecap(String stroke_linecap) {
        withAttribute("stroke-linecap", stroke_linecap);
        return this;
    }

    public SvgPath stroke_linejoin(String stroke_linejoin) {
        withAttribute("stroke-linejoin", stroke_linejoin);
        return this;
    }

    public SvgPath stroke_width(String stroke_width) {
        withAttribute("stroke-width", stroke_width);
        return this;
    }

    public Tag build() {
        return this;
    }

}
