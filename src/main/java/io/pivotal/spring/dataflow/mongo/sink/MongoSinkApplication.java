package io.pivotal.spring.dataflow.mongo.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoSinkApplication.class, args);
	}
}
