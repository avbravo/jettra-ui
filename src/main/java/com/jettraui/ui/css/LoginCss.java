/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.jettraui.ui.css;

/**
 *
 * @author avbravo
 */
public enum LoginCss {
    Label("block mb-2.5 text-sm font-medium text-heading"),
    LabelCheck("flex items-start mb-5"),
    Input("bg-neutral-secondary-medium border border-default-medium text-heading text-sm rounded-base focus:ring-brand focus:border-brand block w-full px-3 py-2.5 shadow-xs placeholder:text-body"),
    InputCheck("w-4 h-4 border border-default-medium rounded-xs bg-neutral-secondary-medium focus:ring-2 focus:ring-brand-soft"),
    P("ms-2 text-sm font-medium text-heading select-none"),
    A("text-fg-brand hover:underline"),
    Div("mb-5"),
    Form("max-w-sm mx-auto")
    ;

    
    public final String css;

    private LoginCss(String css) {
        this.css = css;
    }
}
