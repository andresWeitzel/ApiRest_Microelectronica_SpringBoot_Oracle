# ApiRest_Microelectronica_SpringBoot_Oracle

* Api Restful para la Aplicación Web de Microelectrónica AppGestionMicroelectronica_SpringBoot (https://github.com/andresWeitzel/AppGestionMicroelectronica_SpringBoot)
* La Misma consta de todas las Operaciones CRUD , Búsquedas independientes de tipo Like , todos los objetos de tipo getBy se manipulan como paginados, salvo los getById que se requiere un response por objeto, Se Desarrollan Clases Específicas para el Manejo de Excepciones para cada Servicio Completo , Todas las funcionalidades tienen generación de logs en el Server para los errores y excepciones, documentación completa de la Api con open-api para la visualización con swagger, las anotaciones de open-api se aplican junto con los códigos de respuesta de tipo HTTP para cada función en los controllers
* Se pone a disposición todos los recursos anteriores para Componentes, Componentes Detalles y Capacitores Electrolíticos . 
* Repositorio de la Base de Datos de la Api : https://github.com/andresWeitzel/db_microelectronica_Oracle


</br>

### Tecnologías Implementadas

| **Tecnologías** | **Versión** | **Finalidad** |               
| ------------- | ------------- | ------------- |
| Java |   12.0.2 | JDK |
| Spring Tool Suite 4 | 4.9.0  | IDE |
| Spring Boot |   2.6.4  | Framework |
| Spring Boot Data JPA  | 2.6.3 | Mapeo de objetos y persistencia en la db |
| Lombok | 1.18.22 | Automatización de Código | 
| Open-Api y UI Swagger | 1.6.4 | Documentación de la Api | 
| UI Swagger | 1.6.4 | Visualización y Gestión de la Api | 
| Maven |  4.0.0 | Gestor de Proyectos |
| Oracle XE 21c | 21.4.1 | Sistema de Gestión de Bases de Datos |
| SQL Developer | 21.4.1  | Editor de Base de Datos |
| CMD | 10 | Símbolo del Sistema para linea de comandos | 
| GNU bash / Terminal | 4.4.23  | Bash / Terminal para el manejo e implementación de Git integrado al Spring Tool Suite |
| Git | 2.29.1  | Control de Versiones |


</br>

### Descarga y Documentacion de las Tecnologías Implementadas

| **Tecnología**  | **Descarga** | **Documentación** |               
| ------------- | ------------- | ------------- |
| Java-JDK 12 | https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html |  https://docs.oracle.com/en/ |
| Spring Tool Suite 4 |https://spring.io/tools | https://spring.io/guides |
| Lombok | https://projectlombok.org/download | https://projectlombok.org/download |
| Open UI |https://open-ui.org/ | https://open-ui.org/ |
| Maven Repository | https://mvnrepository.com/ | https://mvnrepository.com/ | 
| Oracle | https://www.oracle.com/database/technologies/oracle21c-windows-downloads.html | https://www.oracle.com/database/technologies/oracle21c-windows-downloads.html|
| SQL Developer | https://www.oracle.com/tools/downloads/sqldev-downloads.html | https://www.oracle.com/tools/downloads/sqldev-downloads.html |
| Git  | https://git-scm.com/downloads |  https://git-scm.com/docs |

</br>

### Patrones de Diseño Implementados

| **Patrón de Diseño** | **Finalidad** |               
| ------------- | ------------- |
| DAO | Uso de interfaces entre la aplicación y el almacenamiento de datos. |
| MVC | Separación y Representación de los Datos, Manejo de errores, Escalabilidad, etc  |

</br>

### Dependencias Implementadas

| **Dependencia Maven**  | **Versión** | **Finalidad** |             
| ------------- | ------------- | ------------- |
| spring-boot-starter-data-jpa | 2.6.4 | Api de JpaRepository para el manejo de métodos | 
| spring-boot-starter-test | 2.6.4 | Para Testing | 
| spring-boot-starter-web | 2.6.4 | Se agrega toda la configuración web automáticamente de Maven a Spring | 
| springdoc-openapi-ui | 1.6.4 | Plantillas para el Front |
| spring-boot-devtools | 2.6.4 | Herramientas para el Manejo de Spring Boot | 
| ojdbc8 | 21.3.0.0 | Driver para el SGDB Oracle | 
| lombok | 1.18.22 |  Dependencia para la automatización de Código |




</br>

### Documentación No Oficial Recomendada

* Config open-api y Swagger: https://www.baeldung.com/spring-rest-openapi-documentation
* Tutorial doc open-api : https://www.youtube.com/watch?v=iaVBleTf88U
* Ej de anotation open-api : https://github.com/dailycodebuffer/Spring-MVC-Tutorials/blob/master/openapi-documentation/src/main/java/com/dailycodebuffer/controller/BookController.java
* Códigos HTTP de respuestas desarrollar en apis :https://www.ibm.com/docs/es/odm/8.5.1?topic=api-rest-response-codes-error-messages



<hr>


