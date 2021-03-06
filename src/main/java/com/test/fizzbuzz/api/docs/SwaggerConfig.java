package com.test.fizzbuzz.api.docs;

/* Responsible for generating the swagger documentation. It can be accessed using URL
 * http://localhost:8090/swagger-ui.html
 */
import com.google.common.base.Predicates;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig 
{
	@Bean
	public Docket api() 
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(Predicates.not(PathSelectors.regex("/error")))
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() 
	{
		String description = "Fizzbuzz Example";
		return new ApiInfoBuilder()
				.title("FizzBuzz Test")
				.description(description)
				.termsOfServiceUrl("github")
				.license("Abhishek")
				.licenseUrl("")
				.version("1.0")
				.build();
	}

}
