package org.example.pg;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class PgApplication {

	public static void main(String[] args) {

		SpringApplication.run(PgApplication.class, args);

		log.info("Application started with args: {}", Arrays.toString(args));
	}

}
