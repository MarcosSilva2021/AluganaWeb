package com.aluganaweb.AluganaWeb.entity.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoForm {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String descricao;

    @NotEmpty(message = "Preencha o campo corretamente.")
    //@Positive(message = "O Id do proprietario precisa ser positivo.")
    private float valor_aluguel;

    @NotEmpty(message = "Preencha o campo corretamente.")
    //@Positive(message = "O Id do proprietario precisa ser positivo.")
    private long proprietario;

   }

