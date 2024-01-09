package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"net.javaguides.springboot.entity"})
public class SpringbootSearchRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSearchRestApiApplication.class, args);
	}

}
