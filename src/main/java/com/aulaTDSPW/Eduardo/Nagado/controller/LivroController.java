package com.aulaTDSPW.Eduardo.Nagado.controller;

import com.aulaTDSPW.Eduardo.Nagado.entity.Categoria;
import com.aulaTDSPW.Eduardo.Nagado.entity.Livro;
import com.aulaTDSPW.Eduardo.Nagado.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    LivroService livroService;

    @GetMapping("/lista")
    public String listarLivros(Model model) {
        List<Livro> livros = livroService.readLivros();
        model.addAttribute("listaLivros", livros);
        return "livroLista";
    }

    @GetMapping("/cadastro")
    public String cadastroLivro(Model model) {
        model.addAttribute("livro", new Livro());
        model.addAttribute("categoriaLista", Arrays.asList(Categoria.values()));
        return "livroCadastro";
    }

    @PostMapping("/cadastrar")
    public String cadastrarLivro(@Valid Livro livro, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("livro", livro);
            model.addAttribute("categoriaLista", Arrays.asList(Categoria.values()));
            return "livroCadastro";
        }
        livroService.createLivro(livro);
        return listarLivros(model);
    }
}