package com.acervo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "books")
public class Livro {
    @Id
    private String id;
    private String titulo;
    private String autor;
    private int ano;
}
