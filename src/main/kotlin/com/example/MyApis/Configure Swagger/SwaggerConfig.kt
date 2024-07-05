package com.example.MyApis.`Configure Swagger`

import io.swagger.v3.oas.models.ExternalDocumentation
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration




    @Configuration
    class SwaggerConfig {

        @Bean
        fun customOpenAPI(): OpenAPI {
            return OpenAPI()
                .info(
                    Info()
                        .title("My API")
                        .version("1.0")
                        .description("This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3.")
                        .termsOfService("http://swagger.io/terms/")
                        .license(
                            License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")
                        )
                )
                .externalDocs(
                    ExternalDocumentation()
                        .description("SpringDoc OpenAPI Documentation")
                        .url("https://springdoc.org/")
                )
        }
    }


