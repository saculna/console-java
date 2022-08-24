package models;

import java.util.List;

public class Aluno {
  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  private List<Float> notas;

  public List<Float> getNotas() {
    return notas;
  }

  public void setNotas(List<Float> notas) {
    this.notas = notas;
  }

  public String situacao() {
    var media = this.media();
    if (media < 5)
      return "Reprovado";
    else if (media >= 5 && media < 6)
      return "Recuperacao";
    else
      return "Aprovado";

  }

  public Float media() {
    float mediaCalculada = (float) 0.0;

    if (this.notas != null) {
      for (Float nota : this.notas) {
        mediaCalculada += nota;

      }
      mediaCalculada = mediaCalculada / this.notas.size();
    }

    return mediaCalculada;
  }
}
