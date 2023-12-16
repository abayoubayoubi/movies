package dev.ayoub.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication {


	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
//	@GetMapping("dashboard/")
//	public String apiRoot(){
//		return "hello , world !";
//	}

}
