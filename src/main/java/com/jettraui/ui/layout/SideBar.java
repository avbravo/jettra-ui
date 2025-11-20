/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.layout;

/**
 *
 * @author avbravo
 */




import com.jettraui.ui.core.Tag;
import com.jettraui.ui.core.WebComponent;
import com.jettraui.ui.menu.MenuLink;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public class SideBar implements WebComponent {
    private final HttpServletRequest request;
    private final Map<String, List<MenuLink>> menuSections; 

    public SideBar(HttpServletRequest request, Map<String, List<MenuLink>> menuSections) {
        this.request = request;
        this.menuSections = menuSections;
    }

    @Override
    public String render() {
        String contextPath = request.getContextPath();
        String framework = (String) request.getSession().getAttribute("cssFramework");
        boolean isTailwind = "tailwind".equals(framework);
        
        // Las clases 'sidebar' y 'shadow-lg' son definidas en main-styles.css
        Tag sidebar = new Tag("div").withClass("sidebar shadow-lg")
            .withAttribute("id", "mySidebar");
            
        // Estructura de menú: 'nav flex-column' (BS) vs. 'flex flex-col' (TW)
        String menuClasses = isTailwind ? "flex flex-col sidebar-nav mt-4" : "nav flex-column sidebar-nav mt-4";
        Tag menuUl = new Tag("ul").withClass(menuClasses);
        
        menuSections.forEach((sectionTitle, links) -> {
            
            if (sectionTitle != null && !sectionTitle.isEmpty()) {
                menuUl.withChild(new Tag("li").withClass("sidebar-header").withText(sectionTitle));
            } else {
                // 'sidebar-divider' es clase de main-styles.css
                menuUl.withChild(new Tag("li").withChild(new Tag("hr").withClass("sidebar-divider")));
            }

            if (links != null) {
                String liClasses = isTailwind ? "my-1" : "nav-item";
                String linkClasses = isTailwind ? "nav-link block" : "nav-link";

                links.forEach(link -> {
                    String activeClass = link.isActive() ? "active" : "";
                    String iconMargin = isTailwind ? "mr-2" : "me-2";

                    Tag icon = new Tag("i").withClass(link.getIconClass() + " " + iconMargin);
                    
                    Tag anchor = new Tag("a").withClass(linkClasses + " " + activeClass)
                        .withAttribute("href", contextPath + link.getUrl())
                        .withChild(icon) 
                        .withText(link.getText()); 
                    
                    menuUl.withChild(new Tag("li").withClass(liClasses).withChild(anchor));
                });
            }
        });

        sidebar.withChild(menuUl);
        return sidebar.render();
    }
}