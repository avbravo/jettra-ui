/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.login;

/**
 *
 * @author avbravo
 */
import com.jettraui.ui.alert.Alert;
import com.jettraui.ui.body.Body;
import com.jettraui.ui.button.Button;
import com.jettraui.ui.button.ButtonType;
import com.jettraui.ui.core.WebComponent;
import com.jettraui.ui.div.Div;
import com.jettraui.ui.form.Form;
import com.jettraui.ui.head.Head;
import com.jettraui.ui.headings.H1;
import com.jettraui.ui.headings.H4;
import com.jettraui.ui.html.A;
import com.jettraui.ui.html.Html;
import com.jettraui.ui.html.Image;
import com.jettraui.ui.html.Label;
import com.jettraui.ui.html.Meta;
import com.jettraui.ui.html.Option;
import com.jettraui.ui.html.Section;
import com.jettraui.ui.html.Select;
import com.jettraui.ui.input.InputPassword;
import com.jettraui.ui.input.InputText;
import com.jettraui.ui.li.Link;
import com.jettraui.ui.script.Script;
import java.util.Map;

public class LoginAdvanced implements WebComponent {

    // <editor-fold defaultstate="collapsed" desc="Inject">
    LoginInfoUI loginInfoUI = new LoginInfoUI("", "", "", "", "", "");

// </editor-fold>
    private final String contextPath;
    private Alert alert;
    private final Map<String, String> userRoles; // Clave: value (admin), Valor: texto a mostrar (Administrador)
    private final String loginTitle;
    private final String applicativeMetaTitle;

    /**
     * Constructor para el componente de Login Avanzado.
     *
     * @param contextPath Path base de la aplicación.
     * @param errorAlert Componente de alerta (puede ser null).
     * @param userRoles Mapa de roles (value HTML -> texto a mostrar).
     */
    public LoginAdvanced(String contextPath, Alert alert, Map<String, String> userRoles, LoginInfoUI loginInfoU) {
        this.contextPath = contextPath;
        this.alert = alert;
        this.userRoles = userRoles;
        this.loginTitle = loginInfoUI.loginTitle();
        this.applicativeMetaTitle = loginInfoUI.applicativeMetaTitle();
        this.loginInfoUI = loginInfoUI;

    }

    @Override
    public String render() {
        
     
        
        // 1. Contenido del Formulario

        // 1.1. Campo SELECT/ROL
        Select selectTag = new Select()
                .name("userRol")
                .addClass("bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500")
                .required(Boolean.TRUE);

        // Opción por defecto
        selectTag.add(
                new Option()
                        .value("")
                        .disabled(Boolean.TRUE)
                        .selected(Boolean.TRUE)
                        .text("Seleccionar Rol")
        );

        // Generar opciones dinámicamente
        userRoles.forEach((value, text)
                -> selectTag.add(new Option()
                        .value(value)
                        .text(text))
        );

        Section section = new Section()
                .addClass("flex flex-col items-center justify-center px-6 py-8 mx-auto md:h-screen lg:py-0")
                .add(
                        new A()
                                .addClass("flex items-center mb-6 text-2xl font-semibold text-gray-900 dark:text-white")
                                .add(
                                        new Image().addClass(loginInfoUI.loginLogoClass()).src(loginInfoUI.loginLogoSrc()).alt("logo")
                                )
                                .add(new H4().text(loginTitle).addClass("text-xl font-medium text-gray-900 dark:text-dark")
                                )
                )
                .add(
                        new Div().addClass("w-full bg-white rounded-lg shadow dark:border md:mt-0 sm:max-w-md xl:p-0 dark:bg-gray-800 dark:border-gray-700")
                                .add(
                                        new Div().addClass("p-6 space-y-4 md:space-y-6 sm:p-8")
                                                .add(
                                                        new H1()
                                                                .text("Inicia sesión")
                                                                .addClass("text-xl font-bold leading-tight tracking-tight text-gray-900 md:text-2xl dark:text-white")
                                                )
                                                .add(
                                                        new Form()
                                                                .action(contextPath + "/login")
                                                                .method("POST")
                                                                .addClass("space-y-4 md:space-y-6")
                                                                .add(new Div()
                                                                        .add(
                                                                                new Label().text("Username").forField("username").addClass("block mb-2 text-sm font-medium text-gray-900 dark:text-white"))
                                                                        .add(new InputText().id("username").name("username")
                                                                                .addClass("bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500")
                                                                                .required(Boolean.TRUE)
                                                                                .placeholder("Ingrese username")
                                                                        )
                                                                )
                                                                .add(new Div()
                                                                        .add(new Label().text("Password").addClass("block mb-2 text-sm font-medium text-gray-900 dark:text-white"))
                                                                        .add(new InputPassword().id("password").name("password")
                                                                                .addClass("bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500")
                                                                                .required(Boolean.TRUE)
                                                                                .placeholder("••••••••")
                                                                        )
                                                                )
                                                                .add(
                                                                        new Div()
                                                                                .add(new Label().text("Rol").addClass("block mb-2 text-sm font-medium text-gray-900 dark:text-white"))
                                                                                .add(selectTag)
                                                                )
                                                                .add(
                                                                        new Div().addClass("flex items-center justify-between")
                                                                                .add(
                                                                                        new A().text("¿Olvidaste la contraseña?")
                                                                                                .href(contextPath + "/forgot-password")
                                                                                                .addClass("text-sm font-medium text-primary-600 hover:underline dark:text-primary-500")
                                                                                )
                                                                )
                                                                .add(
                                                                        new Button().text("Iniciar Sesion")
                                                                                .type(ButtonType.SUBMIT)
                                                                                .addClass("w-full text-white bg-blue-600 hover:bg-blue-700 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800")
                                                                )
                                                )
                                )
                );

        if (alert != null) {
            section.add(alert);
        }
        // Body recibe la clase 'dark-mode'
        Body body = new Body().addClass("bg-gray-50 dark:bg-gray-900")
                .add(section)
                .add(
                        new Script().src(loginInfoUI.flowbiteMinJs())
                );

        Html html = new Html()
                .add(new Head()
                        .add(new Meta().charset("UTF-8"))
                        .add(new Meta().name("viewport").content("width=device-width, initial-scale=1"))
                        .add(new Meta().text(applicativeMetaTitle))
                        .add(new Link().rel("stylesheet").href(loginInfoUI.flowbiteMinJs()))
                        .add(new Script().src(loginInfoUI.tailwindcssJs()))
                        .add(new Script().code("tailwind.config = {\n  darkMode: 'class',\n }"))
                )
                .add(body);

        return html.render();

    }

    public WebComponent build() {
        return this;
    }

}
