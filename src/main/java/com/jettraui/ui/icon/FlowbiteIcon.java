/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.icon;

/**
 *
 * @author avbravo
 */


import com.jettraui.ui.core.Tag;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Componente que genera un icono SVG basado en Heroicons/Flowbite.
 */
public class FlowbiteIcon extends Tag {

    // ⭐ MAPA DE ICONOS: Nombre del icono -> Ruta del path SVG
    // Se recomienda usar paths de iconos de 24x24 (Heroicons)
    private static final Map<String, String> ICON_PATHS;

    static {
        Map<String, String> map = new HashMap<>();
        // ICONOS ESENCIALES DEL DASHBOARD
        map.put("dashboard", "M10 3v4a1 1 0 0 0 1 1h4a1 1 0 0 0 1-1V3M4 7V4h16v3M4 14V9h16v5M4 21v-4h16v4");
        map.put("settings", "M12 10a2 2 0 0 0-2 2v1h4v-1a2 2 0 0 0-2-2Zm0-8a2 2 0 0 0-2 2v1a2 2 0 0 0 2 2h0a2 2 0 0 0 2-2V4a2 2 0 0 0-2-2Z");
        map.put("user", "M10 10a2 2 0 0 0 2 2h0a2 2 0 0 0 2-2V7a2 2 0 0 0-2-2H9a2 2 0 0 0-2 2v3a2 2 0 0 0 2 2Zm0 0V7a2 2 0 0 0-2-2H7a2 2 0 0 0-2 2v3a2 2 0 0 0 2 2Zm-2 4h8a2 2 0 0 0 2-2v-1h-2a4 4 0 0 0-4 4h-2a4 4 0 0 0-4-4H5v1a2 2 0 0 0 2 2Z");
        map.put("logout", "M20 12H8m12 0-4 4m4-4-4-4M9 4h-3a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h3");
        map.put("bell", "M12 2c-5.5 0-10 4.5-10 10s4.5 10 10 10 10-4.5 10-10S17.5 2 12 2Zm0 16a2 2 0 1 1 0-4 2 2 0 0 1 0 4Z");
        map.put("menu", "M3 12h18M3 6h18M3 18h18"); 
        
        // ICONOS PARA FORMULARIOS Y ACCIONES
        map.put("file", "M10 3v4a1 1 0 0 0 1 1h4M6 10h12M6 14h12M6 18h12"); // Archivo/Documento
        map.put("list", "M19 8h-4v4h4M7 8h4v4H7M7 14h12v4H7"); // Lista/Tabla
        map.put("save", "M10 3v4a1 1 0 0 0 1 1h4M6 21v-4h16v4M6 3h16v4H6"); // Guardar
        map.put("delete", "M10 11v6m4-6v6M5 7h14m-1.5 0v10a2 2 0 0 1-2 2h-7a2 2 0 0 1-2-2V7h11Z"); // Papelera
        
        // ICONOS DE ESTADO Y TEMA
        map.put("sun", "M12 2.5a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-1 0V3a.5.5 0 0 1 .5-.5ZM13.9 4.9a.5.5 0 0 1 0 .707l-.707.707a.5.5 0 0 1-.707 0L12.5 5.6a.5.5 0 0 1 0-.707l.707-.707a.5.5 0 0 1 .707 0ZM7.3 5.6a.5.5 0 0 1 0 .707l-.707.707a.5.5 0 0 1-.707 0L5.6 7.3a.5.5 0 0 1 0-.707l.707-.707a.5.5 0 0 1 .707 0ZM3 13a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 0 1h-1a.5.5 0 0 1-.5-.5ZM19 13a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 0 1h-1a.5.5 0 0 1-.5-.5ZM12 17.5a.5.5 0 0 1 .5-.5v1a.5.5 0 0 1-1 0v-1a.5.5 0 0 1 .5-.5ZM5.6 18.7a.5.5 0 0 1 0-.707l.707-.707a.5.5 0 0 1 .707 0l.707.707a.5.5 0 0 1 0 .707l-.707.707a.5.5 0 0 1-.707 0ZM18.7 18.7a.5.5 0 0 1 0-.707l-.707-.707a.5.5 0 0 1-.707 0l-.707.707a.5.5 0 0 1 0 .707l.707.707a.5.5 0 0 1 .707 0ZM12 7a5 5 0 1 0 0 10 5 5 0 0 0 0-10Z"); 
        map.put("moon", "M12 3a9 9 0 1 0 9 9 9 9 0 0 0-9-9Zm0 16a7 7 0 0 1-7-7 7 7 0 0 1 7-7 7 7 0 0 1 7 7 7 7 0 0 1-7 7Z");
        
        ICON_PATHS = Collections.unmodifiableMap(map);
    }

    /**
     * @param iconName El nombre del icono (ej: "dashboard", "bell", "save").
     * @param size El tamaño en unidades Tailwind (ej: "6" para w-6 h-6).
     * @param colorClass Clases de color Tailwind (ej: "text-blue-500", "text-gray-400").
     */
    public FlowbiteIcon(String iconName, String size, String colorClass) {
        super("svg");
        
        String path = getSvgPath(iconName.toLowerCase());
        
        // Atributos base del SVG
        this.withAttribute("aria-hidden", "true")
            .withAttribute("xmlns", "http://www.w3.org/2000/svg")
            .withAttribute("fill", "none")
            .withAttribute("viewBox", "0 0 24 24")
            // Clases de tamaño y color (e.g., w-6 h-6 text-gray-400)
            .withClass("w-" + size + " h-" + size + " " + colorClass);
        
        // Añadir el path SVG si existe
        if (!path.isEmpty()) {
            this.withChild(new Tag("path")
                .withAttribute("stroke", "currentColor")
                .withAttribute("stroke-linecap", "round")
                .withAttribute("stroke-linejoin", "round")
                .withAttribute("stroke-width", "2")
                .withAttribute("d", path));
        }
    }
    
    private static String getSvgPath(String iconName) {
        return ICON_PATHS.getOrDefault(iconName, "");
    }
}