/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.css.type;

import com.jettraui.ui.css.FormRowCss;
import com.jettraui.ui.css.GridColCss;
import com.jettraui.ui.css.InputFileCss;
import com.jettraui.ui.css.RadioAdvancedLayoutCss;
import com.jettraui.ui.css.RadioAdvancedLayoutIconCss;
import com.jettraui.ui.css.RadioBorderCss;
import com.jettraui.ui.css.RadioCss;
import com.jettraui.ui.css.RadioDropdownCss;
import com.jettraui.ui.css.RadioHorizontalListGroupCss;
import com.jettraui.ui.css.RadioInlineCss;
import com.jettraui.ui.css.RadioListGroupCss;
import com.jettraui.ui.css.RadioTwoColumnsCss;

/**
 *
 * @author avbravo
 */
public class CssTypeInputServices {


    public String toCss(CssType cssType) {
        String result = "";
        switch (cssType) {
            case FormRow:
                result = (FormRowCss.Input.css);
                break;
            case GridCol:
                result = (GridColCss.Input.css);
                break;
            case InputFile:
                result = (InputFileCss.Input.css);
                break;
            case RadioAdvancedLayout:
                result = (RadioAdvancedLayoutCss.Input.css);
                break;
                   case RadioAdvancedLayoutIcon:
                result = (RadioAdvancedLayoutIconCss.Input.css);
                break;
            case RadioBorder:
                result = (RadioBorderCss.Input.css);
                break;
            case Radio:
                result = (RadioCss.Input.css);
                break;

            case RadioDropdown:
                result = (RadioDropdownCss.Input.css);
                break;
            case RadioHorizontalListGroup:
                result = (RadioHorizontalListGroupCss.Input.css);
                break;
            case RadioInline:
                result = (RadioInlineCss.Input.css);
                break;
            case RadioListGroup:
                result = (RadioListGroupCss.Input.css);
                break;
            case RadioTwoColumns:
                result = (RadioTwoColumnsCss.Input.css);
                break;

            default:
                break;

        }
        return result;
    }
    
}
