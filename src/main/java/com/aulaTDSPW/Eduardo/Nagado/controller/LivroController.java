package com.aulaTDSPW.Eduardo.Nagado.controller;

import com.aulaTDSPW.Eduardo.Nagado.entity.Livro;
import com.aulaTDSPW.Eduardo.Nagado.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {
    @GetMapping("/lista")
    public String listarLivros(Model model) {
        return "livroLista";
    }
}