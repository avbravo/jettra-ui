# EJemplo de uso de componentes


```java
package fish.payara.controller;

import com.jmoordb.core.ui.Tag;
import com.jmoordb.core.ui.Div;        // Clase Div
import com.jmoordb.core.ui.Button;     // Clase Button
import com.jmoordb.core.ui.InputText;  // Clase InputText
import com.jmoordb.core.ui.WebComponent;
import java.util.Arrays;

public class RegistrationFormGenerator {

    public WebComponent createRegistrationForm() {
        
        // 1. Componentes de Formulario (InputText)
        InputText emailInput = new InputText("email", "Correo Electrónico")
                                    .type("email")
                                    .placeholder("nombre@ejemplo.com")
                                    .build();
        
        InputText passwordInput = new InputText("password", "Contraseña")
                                    .type("password")
                                    .placeholder("••••••••")
                                    .build();
                                    
        // 2. Componentes de Acción (Button)
        Button registerButton = new Button("Crear Cuenta", "primary")
                                    .id("register-btn")
                                    .type("submit")
                                    .withClass("w-full") // Ocupa todo el ancho
                                    .build();
        
        Button cancelButton = new Button("Cancelar", "secondary")
                                    .withAttribute("onclick", "window.history.back()")
                                    .build();

        // 3. Ensamblaje de la Tarjeta (Div)
        // Usamos Div.card() para crear un contenedor con estilos de tarjeta Flowbite
        WebComponent formCard = new Div()
            .card() // Aplica estilos: bg-white shadow-lg rounded-lg p-6
            .withClass("w-full max-w-md mx-auto") // Clases extra para centrar y limitar ancho
            .withChild(
                new Tag("h2")
                    .withClass("text-2xl font-bold dark:text-white mb-6")
                    .withText("Registro de Usuario")
            )
            .withChild(
                new Tag("form").withAttribute("method", "POST").withAttribute("action", "/register-user")
                    .withChild(emailInput)
                    .withChild(passwordInput)
                    .withChild(
                        // Div para agrupar botones (usamos Div.flex() para alineación)
                        new Div().flex() // Aplica estilos: flex items-center
                            .withChild(registerButton)
                            .withChild(cancelButton.withClass("ms-3")) // Añadir margen izquierdo al cancelar
                    )
            );
            
        // 4. Retornar el componente raíz (la tarjeta)
        return formCard;
    }
    
    // Método de ejemplo para renderizar el formulario:
    public static void main(String[] args) {
        RegistrationFormGenerator generator = new RegistrationFormGenerator();
        WebComponent form = generator.createRegistrationForm();
        
        System.out.println("--- HTML Generado (Fragmento) ---");
        System.out.println(form.render());
    }
}

```

Genera

```html
<div class="mb-4 bg-white shadow-lg rounded-lg p-6 dark:bg-gray-800 w-full max-w-md mx-auto">
    <h2>Registro de Usuario</h2>
    <form method="POST" action="/register-user">
        <div class="mb-4">
            <label for="email" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Correo Electrónico</label>
            <input type="email" id="email" name="email" placeholder="nombre@ejemplo.com" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
        </div>
        <div class="mb-4">
            <label for="password" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Contraseña</label>
            <input type="password" id="password" name="password" placeholder="••••••••" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
        </div>
        <div class="flex items-center">
            <button type="submit" id="register-btn" class="w-full font-medium rounded-lg text-sm px-5 py-2.5 text-center transition duration-150 focus:outline-none focus:ring-4 text-white bg-blue-700 hover:bg-blue-800 ...">Crear Cuenta</button>
            <button type="button" onclick="window.history.back()" class="ms-3 font-medium rounded-lg text-sm px-5 py-2.5 text-center transition duration-150 focus:outline-none focus:ring-4 text-gray-900 bg-white border border-gray-200 hover:bg-gray-100 ...">Cancelar</button>
        </div>
    </form>
</div>

```
