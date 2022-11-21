package org.proj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.OAS_30).useDefaultResponseMessages(false).select()
				.apis(RequestHandlerSelectors.basePackage("org.proj.controller")).paths(PathSelectors.any()).build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("1:1 Swagger").build();
	}

	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("http://10.10.11.20:3000")
				.allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS").allowedHeaders("*")
				.allowCredentials(true).maxAge(3600);
	}
}
