package com.api.rest.microelectronica.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI(@Value("3.0") String appVersion) {
	    return new OpenAPI()
	      .info(new Info()
	      .title("ApiRest Microelectrónica SpringBoot Oracle")
	      .version(appVersion)
	      .description("* Api Restful para la Aplicación Web de Microelectrónica AppGestionMicroelectronica_SpringBoot (https://github.com/andresWeitzel/AppGestionMicroelectronica_SpringBoot)\r\n"
	      		+ "* La Misma consta de todas las Operaciones CRUD , Búsquedas independientes de tipo Like , todos los objetos de tipo getBy se manipulan como paginados, salvo los getById que se requiere un response por objeto, Se Desarrollan Clases Específicas para el Manejo de Excepciones para cada Servicio Completo , Todas las funcionalidades tienen generación de logs en el Server para los errores y excepciones personalizadas, documentación completa de la Api con open-api para la visualización con swagger, las anotaciones de open-api se aplican junto con los códigos de respuesta de tipo HTTP para cada función en los controllers\r\n"
	      		+ "* Se pone a disposición todos los recursos anteriores SÓLO para Componentes y Componentes Detalles . \r\n"
	      		+ "* Repositorio de la Base de Datos de la Api : https://github.com/andresWeitzel/db_microelectronica_Oracle")
	      .termsOfService("http://swagger.io/terms/")
	      .license(new License().name("GNU v3.0")
	      .url("https://github.com/andresWeitzel/ApiRest_Microelectronica_SpringBoot_Oracle/blob/master/LICENSE")))
	      ;

	}

}
