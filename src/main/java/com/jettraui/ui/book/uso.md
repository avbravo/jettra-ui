# USO

Ahora la aplicación está completa. Al desplegarla:

Acceder a la raíz (/) redirige a /api/login-view.

LoginJettraView genera la página HTML con el formulario apuntando a /api/auth/login-submit.

AuthResource recibe el POST, simula el éxito (con usuario/password demo/123) y redirige a /api/dashboard-view.

DashboardJettraView utiliza el DashboardLayout y el MenuSideBar para generar la interfaz completa.

Los formularios de ejemplo (/api/form-one, /api/form-two) envían sus datos al FormSubmissionResource normal, que procesa la lógica y redirige de vuelta al dashboard.



DescripciónURL (Asumiendo que corre en localhost:8080)Página de Loginhttp://localhost:8080/api/login-with-roles-view

