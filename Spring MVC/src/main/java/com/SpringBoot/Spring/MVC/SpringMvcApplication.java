package com.SpringBoot.Spring.MVC;

import com.SpringBoot.Spring.MVC.entities.Animal;
import com.SpringBoot.Spring.MVC.entities.Dog;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Bean
	public Animal getDog(){
		return new Dog();
	}
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
