package entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O titulo é obrigatorio")
    private String titulo;

    @NotBlank(message = "O autor é obrigatorio")
    private String Autor;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "A categoria é obrigatoria")
    private Categoria categoria;
    private String editoraa;

    @DecimalMin(value = "0.99", message = "O preco deve ser no minimo 0.99")
    private BigDecimal preco;

    @Pattern(regexp = "^$970\\d(7)$^970\\d(10$)", message = "ESBN fora do padrão")
    private String isbn;

    private LocalDate dataPublicacao;

}
