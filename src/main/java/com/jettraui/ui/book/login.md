# Login


// Antes (método estático):
// String html = LoginViewSimple.build("/auth/login");

// Ahora (extensible):
LoginViewSimple login = new LoginViewSimple("/auth/login");
login.withClass("some-extra-class"); // Extensibilidad, ya que extiende Div/Tag
String html = login.render();




```java
ç// Antes (método estático):
// String html = LoginViewSimple.build("/auth/login");

// Ahora (extensible):
LoginViewSimple login = new LoginViewSimple("/auth/login");
login.withClass("some-extra-class"); // Extensibilidad, ya que extiende Div/Tag
String html = login.render();


```
