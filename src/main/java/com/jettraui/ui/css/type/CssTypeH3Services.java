/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.css.type;

import com.jettraui.ui.css.RadioAdvancedLayoutCss;
import com.jettraui.ui.css.RadioAdvancedLayoutIconCss;
import com.jettraui.ui.css.RadioHorizontalListGroupCss;
import com.jettraui.ui.css.RadioInlineCss;
import com.jettraui.ui.css.RadioListGroupCss;

/**
 *
 * @author avbravo
 */
public class CssTypeH3Services {

    public String toCss(CssType cssType) {
        String result = "";
        switch (cssType) {
            case FormRow:
              //  result = (FormRowCss.H3.css);
                break;
            case GridCol:
            //    result = (GridColCss.H3.css);
                break;
            case InputFile:
                //  result = (InputFileCss.H3.css);
                break;
            case RadioAdvancedLayout:
                result = (RadioAdvancedLayoutCss.H3.css);
                break;
            case RadioAdvancedLayoutIcon:
                result = (RadioAdvancedLayoutIconCss.H3.css);
                break;
            case RadioBorder:
             //   result = (RadioBorderCss.H3.css);
                break;
            case Radio:
             //   result = (RadioCss.H3.css);
                break;

            case RadioDropdown:
               // result = (RadioDropdownCss.H3.css);
                break;
            case RadioHorizontalListGroup:
                result = (RadioHorizontalListGroupCss.H3.css);
                break;
            case RadioInline:
                result = (RadioInlineCss.H3.css);
                break;
            case RadioListGroup:
                result = (RadioListGroupCss.H3.css);
                break;
            case RadioTwoColumns:
            //    result = (RadioTwoColumnsCss.H3.css);
                break;

            default:
                break;

        }
        return result;
    }

   

}
