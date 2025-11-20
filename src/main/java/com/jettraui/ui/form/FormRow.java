
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.form;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;
import com.jettraui.ui.css.FormRowCss;
import com.jettraui.ui.css.type.CssType;
import com.jettraui.ui.html.Label;
import com.jettraui.ui.input.InputColor;
import com.jettraui.ui.input.InputDate;
import com.jettraui.ui.input.InputEmail;
import com.jettraui.ui.input.InputFile;
import com.jettraui.ui.input.InputHidden;
import com.jettraui.ui.input.InputNumber;
import com.jettraui.ui.input.InputPassword;
import com.jettraui.ui.input.InputRange;
import com.jettraui.ui.input.InputSearch;
import com.jettraui.ui.input.InputText;
import com.jettraui.ui.input.InputTime;
import com.jettraui.ui.input.TypeInput;
import com.jettraui.ui.radio.item.RadioItem;

/**
 *
 * @author avbravo
 */
public class FormRow extends Tag {

//    String labelClass = FormRowCss.Label.css;
    String inputClass = FormRowCss.Input.css;
//    String labelClass = "block mb-2 text-sm font-medium text-gray-900 dark:text-white";
//    String inputClass = "bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500";

    /**
     * Color red, blue
     *
     * @param tagName
     * @param color
     */
    public FormRow(String label, String idAndName) {
        super("div");
        withClass("mb-6");
        add(
                new Label(label, CssType.FormRow, idAndName)
        );
        add(
                new InputText(idAndName, idAndName, inputClass)
        );
    }

    public FormRow(String label, String id, String name) {

        super("div");
        withClass("mb-6");
        add(
                new Label(label, CssType.FormRow, id)
        );
        add(
                new InputText(id, name, inputClass)
        );

    }

    public FormRow(Label label, Tag input) {

        super("div");
        withClass("mb-6");
        add(label);
        add(input);

    }

    public FormRow(String label, String id, String name, TypeInput typeInput) {

        super("div");
        withClass("mb-6");
        add(
                new Label(label, CssType.FormRow, id)
        );
        switch (typeInput) {
            case TypeInput.COLOR:
                add(
                        new InputColor(id, name, inputClass)
                );
                break;
            case TypeInput.DATE:
                add(
                        new InputDate(id, name, inputClass)
                );
                break;
            case TypeInput.EMAIL:
                add(
                        new InputEmail(id, name, inputClass)
                );
                break;
            case TypeInput.FILE:
                add(
                        new InputFile(id, name, CssType.InputFile)
                );
                break;
            case TypeInput.HIDDEN:
                add(
                        new InputHidden(id, name, inputClass)
                );
                break;
            case TypeInput.NUMBER:
                add(
                        new InputNumber(id, name, inputClass)
                );
                break;
            case TypeInput.PASSWORD:
                add(
                        new InputPassword(id, name, inputClass)
                );
                break;
            case TypeInput.RADIO:
                add(
                        new RadioItem(id, name, inputClass)
                );
                break;
            case TypeInput.RANGE:
                add(
                        new InputRange(id, name, inputClass)
                );
                break;
            case TypeInput.SEARCH:
                add(
                        new InputSearch(id, name, inputClass)
                );
                break;
            case TypeInput.TEXT:
                add(
                        new InputText(id, name, inputClass)
                );

                break;
            case TypeInput.TIME:
                add(
                        new InputTime(id, name, inputClass)
                );
                break;

            default:
                throw new AssertionError();
        }

    }

    public FormRow(String label, String id, String name, TypeInput typeInput, Boolean required, Boolean readonly) {

        super("div");
        withClass("mb-6");
        add(
                new Label(label, CssType.FormRow, id)
        );

        switch (typeInput) {
            case TypeInput.COLOR:
                add(
                        new InputColor(id, name, inputClass).required(required).readonly(readonly)
                );
                break;
            case TypeInput.DATE:
                add(
                        new InputDate(id, name, inputClass).required(required).readonly(readonly)
                );
                break;
            case TypeInput.EMAIL:
                add(
                        new InputEmail(id, name, inputClass).required(required).readonly(readonly)
                );
                break;
            case TypeInput.FILE:
                add(
                        new InputFile(id, name, inputClass).required(required).readonly(readonly)
                );
                break;
            case TypeInput.HIDDEN:
                add(
                        new InputHidden(id, name, inputClass).required(required).readonly(readonly)
                );
                break;
            case TypeInput.NUMBER:
                add(
                        new InputNumber(id, name, inputClass).required(required).readonly(readonly)
                );
                break;
            case TypeInput.PASSWORD:
                add(
                        new InputPassword(id, name, inputClass).required(required).readonly(readonly)
                );
                break;
            case TypeInput.RADIO:
                add(
                        new RadioItem(id, name, inputClass).required(required).disabled(readonly)
                );
                break;
            case TypeInput.RANGE:
                add(
                        new InputRange(id, name, inputClass).required(required).readonly(readonly)
                );
                break;
            case TypeInput.SEARCH:
                add(
                        new InputSearch(id, name, inputClass).required(required).readonly(readonly)
                );
                break;
            case TypeInput.TEXT:
                add(
                        new InputText(id, name, inputClass).required(required).readonly(readonly)
                );

                break;
            case TypeInput.TIME:
                add(
                        new InputTime(id, name, inputClass).required(required).readonly(readonly)
                );
                break;

            default:
                throw new AssertionError();
        }

    }

    public FormRow addClass(String styleClass) {
        withClass(styleClass);
        return this;
    }

    public FormRow add(WebComponent webComponent) {
        if (webComponent != null) {
            withChild(webComponent);
        }

        return this;
    }

    public Tag build() {
        return this;
    }

//    public String getLabelClass() {
//        return labelClass;
//    }
//
//    public void setLabelClass(String labelClass) {
//        this.labelClass = labelClass;
//    }

    public String getInputClass() {
        return inputClass;
    }

    public void setInputClass(String inputClass) {
        this.inputClass = inputClass;
    }

}
