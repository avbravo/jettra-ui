/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.jettra;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
/**
 *
 * @author avbravo
 */


/**
 * Clase Fluent para configurar los atributos de una HttpSession.
 */
public class SessionConfigurator {

    private final HttpSession session;

    /**
     * Constructor que acepta la sesión a configurar.
     * @param session La HttpSession a modificar.
     */
    public SessionConfigurator(HttpSession session) {
        this.session = session;
    }

    // Método estático para iniciar la configuración
    public static SessionConfigurator configure(HttpSession session) {
        return new SessionConfigurator(session);
    }

    // --- Métodos Fluent para configurar atributos ---

    public SessionConfigurator withUsername(String username) {
        this.session.setAttribute("username", username);
        this.session.setAttribute("name", username); // Asume que 'name' es igual a 'username'
        return this; // Devuelve la propia instancia para encadenar
    }

    public SessionConfigurator withUserId(Long iduser) {
        this.session.setAttribute("iduser", iduser);
        return this;
    }

    public SessionConfigurator withUserRole(String userRol, Long idrol) {
        this.session.setAttribute("userRol", userRol);
        this.session.setAttribute("idrol", idrol);
        return this;
    }

    public SessionConfigurator withCssFramework(String framework) {
        this.session.setAttribute("cssFramework", framework);
        return this;
    }

    public SessionConfigurator setAuthenticationStatus(boolean isAuthenticated, boolean hasAuthorization) {
        this.session.setAttribute("isAuthentication", isAuthenticated);
        this.session.setAttribute("hasAuthorization", hasAuthorization);
        return this;
    }

    /**
     * Establece el tiempo máximo de inactividad de la sesión.
     * @param seconds El tiempo en segundos.
     * @return La propia instancia para encadenar (opcional).
     */
    public SessionConfigurator setMaxInactiveInterval(int seconds) {
        this.session.setMaxInactiveInterval(seconds);
        return this;
    }
    
    /**
     * Método final que puedes llamar para indicar el final de la configuración,
     * aunque técnicamente no es necesario para el patrón Fluent.
     */
     public void apply() {
        // No hace nada, solo sirve como punto final semántico
     }
}