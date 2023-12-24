package com.example.controle_jee.web;

import com.example.controle_jee.dtos.BookDTO;
import com.example.controle_jee.service.BookManagerDependence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookGraphQlController {
    @Autowired
    private BookManagerDependence bookManagerDependence;
    @QueryMapping
    public BookDTO getBookById(@Argument Long id) {
        return bookManagerDependence.getBookById(id);
    }
    @QueryMapping
    public BookDTO getBookByTitre(@Argument String titre) {
        return bookManagerDependence.getBookByTitre(titre);
    }
    @QueryMapping
    public List<BookDTO> getBookByPublisherAndPrice(@Argument String publisher, @Argument Float price) {
        return bookManagerDependence.getBookByPublisherAndPrice(publisher, price);
    }
    @MutationMapping
    public BookDTO saveBook(BookDTO bookDTO) {
        return bookManagerDependence.saveBook(bookDTO);
    }

    @MutationMapping
    public List<BookDTO> getBooks() {
        return bookManagerDependence.getBooks();
    }

}






