/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.card;

/**
 *
 * @author avbravo
 */


import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;
import com.jettraui.ui.div.Div;

/**
 * Componente que representa un contenedor tipo Card (Tarjeta) de Flowbite/Tailwind.
 * Es esencialmente un Div con estilos predefinidos.
 */
public class Card extends Div {
    
    // Clases base para una tarjeta Flowbite: fondo, sombra, bordes y padding.
    private static final String BASE_CARD_CLASSES = "bg-white shadow-lg rounded-lg p-6 border border-gray-200 dark:bg-gray-800 dark:border-gray-700";

    /**
     * Constructor que inicializa el Div con los estilos de tarjeta Flowbite.
     */
    public Card() {
        super();
        this.withClass(BASE_CARD_CLASSES);
    }
    
    /**
     * Constructor para añadir un título principal a la tarjeta.
     */
    public Card(String title) {
        this();
        this.withChild(new Tag("h5")
            .withClass("mb-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white")
            .withText(title));
    }
    
    // --- Métodos de Chaining para añadir contenido ---
    
    @Override
    public Card withChild(WebComponent component) {
        super.withChild(component);
        return this;
    }

    @Override
    public Card withText(String text) {
        super.withText(text);
        return this;
    }
    
    public Card id(String id) {
        withAttribute("id", id);
        return this;
    }
    
    public Tag build(){
      return this;
    }
}