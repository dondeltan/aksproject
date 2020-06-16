package com.techprimers.mongodb.springbootmongodbexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class SpringBootMongodbExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbExampleApplication.class, args);
	}
}
