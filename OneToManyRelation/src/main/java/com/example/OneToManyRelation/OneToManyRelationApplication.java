package com.example.OneToManyRelation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.Controller")
@ComponentScan("com.example.Service")
@EntityScan("com.example.Model")
@EnableJpaRepositories("com.example.Repository")
public class OneToManyRelationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyRelationApplication.class, args);
	}

}
