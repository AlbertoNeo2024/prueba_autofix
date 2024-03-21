package com.mifel.app.banca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class MifelTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MifelTestApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
