package controller;

import entity.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivroController {
    @GetMapping("/lista")
    public String listarLivros(Model model){

        Livro livro1 = new Livro();
        livro1.getId(2l);
        livro1.getTitulo("Harry Poter");

        Livro livro2 = new Livro();
        livro2.getId(2l);
        livro2.getTitulo("Avatar");

        Livro livro3 = new Livro();
        livro3.getId(2l);
        livro3.getTitulo("Vingadores");

        return "livroLista";
    }
}
