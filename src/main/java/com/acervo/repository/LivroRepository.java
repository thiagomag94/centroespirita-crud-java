package com.acervo.repository;

import com.acervo.model.Livro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends MongoRepository<Livro, String> {
    List<Livro> findByAutorContaining(String autor);
    List<Livro> findByAno(int ano);
}
