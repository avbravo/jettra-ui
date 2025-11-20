# Iconos 

// Ejemplo de uso en Navbar.java
// Icono de notificaciones
Tag bellButton = new Tag("button").withChild(new FlowbiteIcon("bell", "6", "text-gray-500"));

// Ejemplo de uso en Sidebar.java
// Enlace del dashboard
SidebarLink link = new SidebarLink("dashboard", "Dashboard Principal", "/dashboard");
// ... que generaría este icono:
// <svg class="..." ><path d="M10 3v4a1 1 0 0 0 1 1h4a1 1 0 0 0 1-1V3..."/></svg>