/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.div;

/**
 *
 * @author avbravo
 */


import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;

/**
 * Componente que representa la etiqueta <div> optimizado para Flowbite/Tailwind.
 * Añade métodos fluidos para estructuras comunes como card y grid.
 */
public class Div extends Tag {
    
    public Div() {

        super("div");

    }
    public Div(String styleClass) {

        super("div");
        withClass(styleClass);

    }

    public Div addClass(String styleClass) {

        withClass(styleClass);
        return this;
    }

    public Div text(String text) {
        withText(text);
        return this;
    }

    public Div id(String id) {
        withAttribute("id", id);
        return this;
    }

    public Div name(String name) {
        withAttribute("name", name);
        return this;
    }
    public Div attribute(String name, String value) {
        withAttribute(name, value);
        return this;
    }

    public Div add(WebComponent webComponent) {
        if (webComponent != null) {
            withChild(webComponent);
        }

        return this;
    }

   
    /**
     * Aplica clases de sombra, fondo y padding para crear una tarjeta o panel Flowbite/Tailwind.
     * @return La instancia de Div (card).
     */
    public Div card() {
        withClass("bg-white shadow-lg rounded-lg p-6 dark:bg-gray-800");
        return this;
    }
    
    /**
     * Aplica clases para hacer una grilla (grid) de columnas en desktop/mobile.
     * @param columns Número de columnas para la vista en pantalla grande (md/lg).
     * @return La instancia de Div (grid).
     */
    public Div gridCols(int columns) {
        withClass("grid grid-cols-1 md:grid-cols-" + columns + " gap-6");
        return this;
    }
    
    /**
     * Aplica clases para hacer una flexbox container.
     * @return La instancia de Div (flex).
     */
    public Div flex() {
        withClass("flex items-center");
        return this;
    }
    
    
    
   
    
    public Tag build(){
      return this;
    }
}