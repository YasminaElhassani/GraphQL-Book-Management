package com.example.controle_jee.dao.repositories;

import com.example.controle_jee.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByTitre(String titre);

    //List<Book> findByPublisherAndPrice(String publisher, Float price);
    List<Book> findAllByPublisherAndPrice(String publisher, double price);

    void deleteBookById(Long id);

}
