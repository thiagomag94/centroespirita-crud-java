package com.acervo.controller;

import com.acervo.model.Livro;
import com.acervo.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }

    @GetMapping("/autor/{autor}")
    public List<Livro> getLivrosByAutor(@PathVariable String autor) {
        return livroRepository.findByAutorContaining(autor);
    }

    @GetMapping("/ano/{ano}")
    public List<Livro> getLivrosByAno(@PathVariable int ano) {
        return livroRepository.findByAno(ano);
    }

    @PostMapping
    public Livro addLivro(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    @PutMapping("/{id}")
    public Livro updateLivro(@PathVariable String id, @RequestBody Livro livroAtualizado) {
        livroAtualizado.setId(id);
        return livroRepository.save(livroAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable String id) {
        livroRepository.deleteById(id);
    }
}
