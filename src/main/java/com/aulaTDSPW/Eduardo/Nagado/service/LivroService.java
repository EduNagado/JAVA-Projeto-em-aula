package com.aulaTDSPW.Eduardo.Nagado.service;

import com.aulaTDSPW.Eduardo.Nagado.entity.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aulaTDSPW.Eduardo.Nagado.repository.LivroRepository;

import java.util.List;


@Service
public class LivroService {
    private final LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    // CRUD -> Create, Read, Update, Delete
    public Livro createLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro readLivro(Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    public List<Livro> readLivros() {
        return livroRepository.findAll();
    }

    public Livro updateLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public void deleteLivro(Long id) {
        livroRepository.deleteById(id);
    }
}