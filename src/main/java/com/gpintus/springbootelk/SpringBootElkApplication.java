package com.gpintus.springbootelk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootElkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElkApplication.class, args);

		log.info("The application spring-boot-elk is started");
	}

}
