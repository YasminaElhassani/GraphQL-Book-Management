package com.example.controle_jee.service;

import com.example.controle_jee.dao.entities.Book;
import com.example.controle_jee.dao.repositories.BookRepository;
import com.example.controle_jee.dtos.BookDTO;
import com.example.controle_jee.mappers.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookManager implements BookManagerDependence{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;
    @Override
    public BookDTO getBookById(Long id){
        return bookMapper.fromBookToBookDto(bookRepository.findById(id).get());
    }

    @Override
    public BookDTO getBookByTitre(String titre) {
        return bookMapper.fromBookToBookDto((Book) bookRepository.findByTitre(titre));
    }
    @Override
    public List<BookDTO> getBookByPublisherAndPrice(String publisher, double price) {
        List<Book> books = bookRepository.findAllByPublisherAndPrice(publisher, price);
        return books.stream()
                .map(bookMapper::fromBookToBookDto)
                .collect(Collectors.toList());
    }
    @Override
    public BookDTO saveBook(BookDTO bookDTO){
        return bookMapper.fromBookToBookDto(bookRepository.save(bookMapper.fromBookDtoToBook(bookDTO)));
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteBookById(id);
    }

    @Override
    public List<BookDTO> getBooks() {
        List<Book> books = bookRepository.findAll();
        // Convertir la liste de livres en une liste de DTOs
        return books.stream()
                .map(bookMapper::fromBookToBookDto)
                .collect(Collectors.toList());
    }



}




