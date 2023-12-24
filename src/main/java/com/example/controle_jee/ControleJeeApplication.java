package com.example.controle_jee;

import com.example.controle_jee.dao.entities.Book;
import com.example.controle_jee.dao.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ControleJeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleJeeApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(BookRepository bookRepository) {
		return args -> {
			// Creation des books
			List<Book> books = List.of(
					Book.builder().titre("jee").publisher("yasmina").date_Publication(new Date()).price(200).build(),
					Book.builder().titre("java17").publisher("manal").date_Publication(new Date()).price(200).build(),
					Book.builder().titre("python").publisher("malak").date_Publication(new Date()).price(200).build()
			);
			bookRepository.saveAll(books);


		};

	}
}
