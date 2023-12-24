package com.example.controle_jee.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Builder @ToString
public class BookDTO {
    private String titre;
    private String publisher;
    private Date date_Publication;
    private double price;
}

