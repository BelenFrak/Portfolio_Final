package com.portfolio.BelenFraca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BelenFracaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelenFracaApplication.class, args);
	}
        @Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("**").allowedOrigins("https://portfolio-belenfraca.web.app/").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
}
