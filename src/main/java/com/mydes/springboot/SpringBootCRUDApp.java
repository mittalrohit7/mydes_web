package com.mydes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;




@SpringBootApplication(scanBasePackages={"com.mydes.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootCRUDApp {

	public static void main(String[] args) {
		 if (System.getenv("DEMO_TRUSTSTORE_PATH") != null && System.getenv("DEMO_TRUSTSTORE_PASSWORD") != null) {
	            System.setProperty("javax.net.ssl.trustStore", System.getenv("DEMO_TRUSTSTORE_PATH"));
	            System.setProperty("javax.net.ssl.trustStorePassword", System.getenv("DEMO_TRUSTSTORE_PASSWORD"));
	        }
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		RestTemplate restTemplate =  restTemplateBuilder.build();
        return restTemplate;
	}
}
