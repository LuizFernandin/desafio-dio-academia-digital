package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class AvaliacaoFisicaUpdateForm {

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Positive(message = "O Id do aluno precisa ser positivo")
  private double peso;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Positive(message = "O Id do aluno precisa ser positivo")
  private double altura;
}
