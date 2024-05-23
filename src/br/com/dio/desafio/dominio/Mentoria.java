package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
  // atributos

  private LocalDate data;

  public Mentoria() {
  }

  public double calcularXp() {
    return XP_PADRAO + 20d; // quando eu chamar o metodo mentoria e chamar o metodo calcularXp o xp da minha
                            // constante vai ser o XP padrão + 20
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
  }

}
