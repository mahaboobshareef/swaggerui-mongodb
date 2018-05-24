package com.assignment.voucher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}
	
	@Configuration
	@EnableSwagger2
	class SwaggerConfiguration {

	                @Bean
	                public Docket api() {
	                                return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
	                                                                .apis(RequestHandlerSelectors.basePackage("com.assignment.voucher")).paths(PathSelectors.any()).build();
	                }

	                private ApiInfo apiInfo() {
	                                return new ApiInfoBuilder().title("Voucher Payments API").description("Voucher Payments reference for developers")
	                                                                .license("Voucher Payments License").contact(new Contact("PPES", "", "m.shareef.mohammed@gmail.com"))
	                                                                .licenseUrl("m.shareef.mohammed@gmail.com").version("1.0").build();
	                }
	}

}
