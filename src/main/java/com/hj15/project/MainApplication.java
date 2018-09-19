package com.hj15.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.hj15.project.Model.Index;

@SpringBootApplication
public class MainApplication 
{
	private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

	public static void main(String args[]) {
		SpringApplication.run(MainApplication.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Index index = restTemplate.getForObject(
					"http://api.openweathermap.org/data/2.5/weather?lat=40&lon=-83&units=imperial&APPID=65616d6f99565b3b0cb2d752481f75f2", Index.class);
			log.info(index.toString());
		};
	}
}
