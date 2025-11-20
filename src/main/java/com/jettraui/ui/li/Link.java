/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.li;

/**
 *
 * @author avbravo
 */


import com.jettraui.ui.core.Tag;


/**
 * Componente que representa la etiqueta HTML <link> (usada comúnmente para 
 * enlazar hojas de estilo o iconos de favicon).
 * * La etiqueta <link> es un "void element" y no tiene una etiqueta de cierre.
 */
public class Link extends Tag {

    /**
     * Constructor que crea una etiqueta <link>.
     * * @param rel El valor del atributo 'rel' (ej: "stylesheet", "icon").
     * @param href La URL del recurso enlazado.
     */
    public Link(String rel, String href) {
        super("link");
        // Establece los atributos esenciales para un enlace de recurso
        this.withAttribute("rel", rel)
            .withAttribute("href", href);
    }
    
    // Sobrecarga para facilitar el chaining
    public Link() {
        super("link");
    }

    // --- Métodos de Chaining ---

    public Link rel(String rel) {
        withAttribute("rel", rel);
        return this;
    }

    public Link href(String href) {
        withAttribute("href", href);
        return this;
    }

    public Link type(String type) {
        withAttribute("type", type);
        return this;
    }
    
    // Método para atributos específicos de CSS (ej: media)
    public Link media(String media) {
        withAttribute("media", media);
        return this;
    }

 
//    public Link withAttribute(String key, String value) {
//        withAttribute(key, value);
//        return this;
//    }

    public Tag build() {
        return this;
    }
}