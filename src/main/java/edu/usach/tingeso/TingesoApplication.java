package edu.usach.tingeso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication (exclude = {SecurityAutoConfiguration.class })
public class TingesoApplication {

	public static void main(String[] args) {
		//System.setProperty("spring.devtools.restart.enabled", "true");
		SpringApplication.run(TingesoApplication.class, args);
	}
}
