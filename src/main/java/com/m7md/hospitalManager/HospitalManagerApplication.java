package com.m7md.hospitalManager;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableAutoConfiguration
public class HospitalManagerApplication {
	String allowedOrigins = "http://localhost:4200";
	String[] allowedHeaders = new String[] { "Origin", "Access-Control-Allow-Origin", "Content-Type", "Accept",
			"Authorization", "Origin, Accept", "X-Requested-With", "Access-Control-Request-Method",
			"Access-Control-Request-Headers" };
	String[] exposedHeaders = new String[] { "Origin", "Content-Type", "Accept", "Authorization",
			"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials" };
	String[] allowedMethods = new String[] { "GET", "POST", "PUT", "DELETE", "OPTIONS" };

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagerApplication.class, args);
	}

	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList(allowedOrigins));
		corsConfiguration.setAllowedHeaders(Arrays.asList(allowedHeaders));
		corsConfiguration.setExposedHeaders(Arrays.asList(exposedHeaders));
		corsConfiguration.setAllowedMethods(Arrays.asList(allowedMethods));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);

	}
}
