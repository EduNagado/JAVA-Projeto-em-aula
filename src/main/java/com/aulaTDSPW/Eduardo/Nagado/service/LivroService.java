package com.aulaTDSPW.Eduardo.Nagado.service;

import com.aulaTDSPW.Eduardo.Nagado.entity.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aulaTDSPW.Eduardo.Nagado.repository.LivroRepository;


@Service
public class LivroService {

    private LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository){
    }

    //CRUD
    public Livro createLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public Livro readLivro (Long id){
        return livroRepository.findById(id).orElse(null);
    }

    public Livro updateLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public void deletarLivro(Long id){
        livroRepository.deleteById(id);
    }
}
