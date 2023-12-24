package com.example.controle_jee.mappers;

import com.example.controle_jee.dao.entities.Book;
import com.example.controle_jee.dtos.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public BookDTO fromBookToBookDto(Book book){
        return this.modelMapper.map(book, BookDTO.class);
    }
    public Book fromBookDtoToBook(BookDTO bookDTO){
        return this.modelMapper.map(bookDTO, Book.class);
    }

}






