package com.example.controle_jee.service;

import com.example.controle_jee.dtos.BookDTO;

import java.util.List;

public interface BookManagerDependence {
    public BookDTO getBookById(Long id);
    public BookDTO getBookByTitre(String titre);
    List<BookDTO> getBookByPublisherAndPrice(String publisher, double price);

    public BookDTO saveBook(BookDTO bookDTO);

    public void deleteBook(Long id);

    List<BookDTO> getBooks();

}



