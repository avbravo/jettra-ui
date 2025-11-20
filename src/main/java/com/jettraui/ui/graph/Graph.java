/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.graph;

import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;

/**
 *
 * @author avbravo
 */
public class Graph implements WebComponent {
    private final String title;
    public Graph(String title) { this.title = title; }
    @Override
    public String render() {
        return new Tag("div").withClass("h-64 bg-gray-300 dark:bg-gray-700 flex items-center justify-center rounded-lg")
            .withText("Gráfica de " + title + " (Simulada)").render();
    }
    
      public WebComponent build(){
      return this;
   }
}

