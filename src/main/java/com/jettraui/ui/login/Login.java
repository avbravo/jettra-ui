/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.login;

import com.jettraui.ui.alert.Alert;
import com.jettraui.ui.body.Body;
import com.jettraui.ui.button.Button;
import com.jettraui.ui.core.WebComponent;
import com.jettraui.ui.div.Div;
import com.jettraui.ui.form.Form;
import com.jettraui.ui.head.Head;
import com.jettraui.ui.headings.H2;
import com.jettraui.ui.html.A;
import com.jettraui.ui.html.Html;
import com.jettraui.ui.html.Image;
import com.jettraui.ui.html.Label;
import com.jettraui.ui.html.Meta;
import com.jettraui.ui.html.Option;
import com.jettraui.ui.html.P;
import com.jettraui.ui.html.Select;
import com.jettraui.ui.html.Title;
import com.jettraui.ui.input.InputCheckBox;
import com.jettraui.ui.input.InputEmail;
import com.jettraui.ui.input.InputPassword;
import com.jettraui.ui.li.Link;
import com.jettraui.ui.script.Script;
import com.jettraui.ui.svg.Svg;
import com.jettraui.ui.svg.SvgPath;
import java.util.Map;

/**
 *
 * @author avbravo
 */
public class Login implements WebComponent {

    // <editor-fold defaultstate="collapsed" desc="Inject">
    LoginInfoUI loginInfoUI = new LoginInfoUI("", "", "", "", "", "");

// </editor-fold>
    private final String contextPath;
    private Alert alert;
    private final Map<String, String> userRoles; // Clave: value (admin), Valor: texto a mostrar (Administrador)
    private final String loginTitle;
    private final String applicativeMetaTitle;

    /// Basado en https://flowbite.com/docs/components/forms/
    
    
    
    
    
        public Login(String contextPath, Alert alert, Map<String, String> userRoles, LoginInfoUI loginInfoU) {
        this.contextPath = contextPath;
        this.alert = alert;
        this.userRoles = userRoles;
        this.loginTitle = loginInfoUI.loginTitle();
        this.applicativeMetaTitle = loginInfoUI.applicativeMetaTitle();
        this.loginInfoUI = loginInfoUI;
    }

    @Override
    public String render() {
        try {
//            Head head = new Head()
//                    .add(alert);

            String scriptCode
                    = """
                     tailwind.config = {
                                darkMode: 'class', // Configura Tailwind para usar la clase 'dark' en el <html>
                                theme: {
                                    extend: {
                                        // Puedes extender tu paleta de colores aquí si es necesario
                                    }
                                }
                    }
                    """;
            Head head = new Head()
                    .add(new Meta().charset("UTF-8"))
                    .add(new Meta().name("viewport").content("width=device-width, initial-scale=1.0"))
                    .add(new Title(applicativeMetaTitle))
                    .add(new Script("https://cdn.tailwindcss.com"))
                    .add(new Link().href("https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.1.1/flowbite.min.css").rel("stylesheet"))
                    .add(new Script("https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.1.1/flowbite.min.js"))
                    .add(new Script().code(scriptCode));

            Body body = new Body().addClass("bg-white dark:bg-gray-900 min-h-screen flex justify-center items-center p-4")
                    .add(new Script().code(themeScript()));

            Div divMain = new Div("w-full max-w-sm");

            Button buttonTheme = new Button()
                    .id("theme-toggle")
                    .addClass("text-gray-500 dark:text-gray-400 hover:bg-gray-100 dark:hover:bg-gray-700 focus:outline-none focus:ring-4 focus:ring-gray-200 dark:focus:ring-gray-700 rounded-lg text-sm p-2.5 mb-4 float-right")
                    .add(
                            new Svg().id("theme-toggle-dark-icon").addClass("hidden w-5 h-5").fill("currentColor").viewBox("0 0 20 20").xmlns("http://www.w3.org/2000/svg")
                                    .add(new SvgPath().d("M17.293 13.293A8 8 0 016.707 2.707a8.001 8.001 0 1010.586 10.586z"))
                    )
                    .add(
                            new Svg().id("theme-toggle-light-icon").addClass("hidden w-5 h-5").fill("currentColor").viewBox("0 0 20 20").xmlns("http://www.w3.org/2000/svg")
                                    .add(new SvgPath().d("M10 2a1 1 0 011 1v1a1 1 0 11-2 0V3a1 1 0 011-1zm4.356 4.634a1 1 0 11-1.414-1.414l.707-.707a1 1 0 011.414 1.414l-.707.707zM17 10h-1a1 1 0 110-2h1a1 1 0 110 2zm-5.634 4.356a1 1 0 11-1.414 1.414l-.707.707a1 1 0 11-1.414-1.414l.707-.707zM10 15a1 1 0 01-1-1v-1a1 1 0 112 0v1a1 1 0 01-1 1zM4.644 14.356a1 1 0 111.414-1.414l-.707.707a1 1 0 11-1.414 1.414l-.707-.707zM3 10h1a1 1 0 110 2H3a1 1 0 110-2zm3.634-4.356a1 1 0 011.414 1.414l.707-.707a1 1 0 01-1.414-1.414l-.707.707z"))
                    );

            Div divLogo = new Div("mb-4 rounded-lg overflow-hidden shadow-md")
                    .add(
                            new Image().src("https://picsum.photos/400/150").alt("").addClass("w-full h-auto object-cover")
                    );

            Form form = new Form().addClass("max-w-sm mx-auto p-8 bg-white border border-gray-200 rounded-lg shadow-2xl dark:bg-gray-800 dark:border-gray-700");
            H2 h2 = new H2(loginInfoUI.loginTitle()).addClass("text-2xl font-bold mb-6 text-heading dark:text-white");

            Div divEmail = new Div().addClass("mb-5")
                    .add(new Label("Tu email").forField("email").addClass("block mb-2.5 text-sm font-medium text-heading dark:text-white")
                    )
                    .add(
                            new InputEmail().id("email").name("email")
                                    .addClass("bg-neutral-secondary-medium border border-default-medium text-heading text-sm rounded-base focus:ring-brand focus:border-brand block w-full px-3 py-2.5 shadow-xs placeholder:text-body dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-brand dark:focus:border-brand")
                                    .placeholder("micorreo@xw.com")
                    );
            Div divPassword = new Div().addClass("mb-5")
                    .add(new Label("Tu contraseña").forField("password").addClass("block mb-2.5 text-sm font-medium text-heading dark:text-white")
                    )
                    .add(
                            new InputPassword().id("password").name("password")
                                    .addClass("bg-neutral-secondary-medium border border-default-medium text-heading text-sm rounded-base focus:ring-brand focus:border-brand block w-full px-3 py-2.5 shadow-xs placeholder:text-body dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-brand dark:focus:border-brand")
                                    .placeholder("••••••••")
                    );

            Select selectRole = new Select()
                    .name("userRol")
                    .addClass("bg-neutral-secondary-medium border border-default-medium text-heading text-sm rounded-base focus:ring-brand focus:border-brand block w-full px-3 py-2.5 shadow-xs dark:bg-gray-700 dark:border-gray-600 dark:text-white dark:focus:ring-brand dark:focus:border-brand")
                    .required(Boolean.TRUE);

            // Opción por defecto
            selectRole.add(
                    new Option()
                            .value("")
                            .disabled(Boolean.TRUE)
                            .selected(Boolean.TRUE)
                            .text("Seleccionar Rol")
            );

            // Generar opciones dinámicamente
            userRoles.forEach((value, text)
                    -> selectRole.add(new Option()
                            .value(value)
                            .text(text))
            );

            Div divRole = new Div().addClass("mb-5")
                    .add(new Label("Selecciona tu Rol").forField("userRol").addClass("block mb-2.5 text-sm font-medium text-heading dark:text-white")
                    )
                    .add(
                            selectRole
                    );

            Div divRemember = new Div().addClass("flex items-center justify-between mb-5")
                    .add(
                            new Label().forField("remember").addClass("flex items-start")
                                    .add(new InputCheckBox().id("remember").name("remember").addClass("w-4 h-4 border border-default-medium rounded-xs bg-neutral-secondary-medium focus:ring-2 focus:ring-brand-soft dark:bg-gray-700 dark:border-gray-600 dark:focus:ring-brand-soft")
                                    )
                                    .add(
                                            new P().text("Acepto")
                                                    .addClass("ms-2 text-sm font-medium text-heading select-none dark:text-gray-300")
                                                    .add(
                                                            new A("términos y condiciones").addClass("text-fg-brand hover:underline dark:text-blue-500").href("#")
                                                    )
                                    )
                    )
                    .add(
                            new A().addClass("text-sm text-fg-brand hover:underline dark:text-blue-500").href("#")
                    );

            Button submit = new Button("Login").addClass("w-full text-white bg-brand box-border border border-transparent hover:bg-brand-strong focus:ring-4 focus:ring-brand-medium shadow-xs font-medium leading-5 rounded-base text-sm px-4 py-2.5 focus:outline-none dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800");

            Div divFooter = new Div().addClass("mt-6 pt-4 border-t border-gray-200 dark:border-gray-700 text-center")
                    .add(
                            new P("&copy; 2025 Mi Aplicación. ¿Necesitas una cuenta? ")
                                    .addClass("text-xs text-gray-500 dark:text-gray-400")
                                    .add(
                                            new A("Regístrate aquí.").addClass("text-fg-brand hover:underline dark:text-blue-500")
                                                    .href("#")
                                    )
                    );
            /**
             *
             */
            form.add(h2);
            form.add(divEmail);
            form.add(divPassword);
            form.add(divRole);
            form.add(divRemember);
            form.add(submit);
            form.add(divFooter);

            divMain.add(buttonTheme);
            divMain.add(divLogo);
            divMain.add(form);

            body.add(divMain);

            Html html = new Html()
                    .add(head)
                    .add(body);
     
            return html.render();
        } catch (Exception e) {
            System.out.println("Login.render() " + e.getLocalizedMessage());
        }
        return "";
    }

    public WebComponent build() {
        return this;
    }

    private String themeScript() {
        String result = "";
        try {
            result = """
                    const themeToggleBtn = document.getElementById('theme-toggle');
                            const htmlElement = document.documentElement;
                    
                            // Inicializa el tema
                            // Verifica si el usuario ya tiene un tema guardado en localStorage o si prefiere dark mode por defecto en el sistema
                            if (localStorage.getItem('color-theme') === 'dark' || (!('color-theme' in localStorage) && window.matchMedia('(prefers-color-scheme: dark)').matches)) {
                                htmlElement.classList.add('dark');
                            } else {
                                htmlElement.classList.remove('dark');
                            }
                    
                            // Función para alternar el tema
                            themeToggleBtn.addEventListener('click', function() {
                                // Alternar la clase 'dark' en el <html>
                                htmlElement.classList.toggle('dark');
                    
                                // Guardar la preferencia en localStorage
                                if (htmlElement.classList.contains('dark')) {
                                    localStorage.setItem('color-theme', 'dark');
                                } else {
                                    localStorage.setItem('color-theme', 'light');
                                }
                            });
                    
                            // Asegúrate de que los iconos se muestren correctamente
                            const darkIcon = document.getElementById('theme-toggle-dark-icon');
                            const lightIcon = document.getElementById('theme-toggle-light-icon');
                            
                            // Muestra el icono correcto al cargar
                            function toggleIcons() {
                                if (htmlElement.classList.contains('dark')) {
                                    darkIcon.classList.remove('hidden');
                                    lightIcon.classList.add('hidden');
                                } else {
                                    darkIcon.classList.add('hidden');
                                    lightIcon.classList.remove('hidden');
                                }
                            }
                            
                            // Ejecutar al cargar la página
                            toggleIcons();
                    
                            // Ejecutar al hacer click
                            themeToggleBtn.addEventListener('click', toggleIcons);
                    """;
        } catch (Exception e) {
            System.out.println("Login.themeScript() " + e.getLocalizedMessage());
        }
        return result;
    }
}
