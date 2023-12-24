package com.example.controle_jee.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
@Entity @Setter @Getter
@AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String publisher;
    private Date date_Publication;
    private double price;
    private String resume;
}
