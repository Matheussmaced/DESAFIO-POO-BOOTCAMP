package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
  private String nome;
  private Set<Conteudo> conteudosInscrições = new LinkedHashSet<>(); // enquanto vou se escrevendo no curso, quero que
                                                                     // sejam salvos, que coloquem na mesma ordem
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // quero que quando concluidos, sejam colocados na
                                                                     // ordem
  // metodos

  public void inscreverBootcamp(Bootcamp bootcamp) {
    // estou pegando tudo que tem no getConteudos e adicionando no
    // conteudosInscrições
    this.conteudosInscrições.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this); // peguei o set que tem todos os devs inscritos e adicionei esse dev que se
                                           // inscreveu nesse bootcamp que se passa como argumento
  }

  // para progredir, tenho que pegar o conteudo de dentro do conteudosIncrições e
  // colocar dentro do conteudosConcluidos
  public void progredir() {
    Optional<Conteudo> conteudo = this.conteudosInscrições.stream().findFirst(); // conteudos inscritos
    if (conteudo.isPresent()) {
      this.conteudosConcluidos.add(conteudo.get());
      this.conteudosInscrições.remove(conteudo.get());
    } else {
      System.err.println("Você não está matriculado em nenhum conteúdo!");
    }

  }

  public double calcularXp() {
    // peguei e utilizei o stream API e peguei cada conteudo dentro do meu set de
    // conteudosConcluidos, peguei o xp de cada conteudo e somei
    return this.conteudosConcluidos
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sum();
  }

  public String getNome() {
    return nome;
  }

  public Set<Conteudo> getConteudosInscrições() {
    return conteudosInscrições;
  }

  public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setConteudosInscrições(Set<Conteudo> conteudosInscrições) {
    this.conteudosInscrições = conteudosInscrições;
  }

  public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
    this.conteudosConcluidos = conteudosConcluidos;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((conteudosInscrições == null) ? 0 : conteudosInscrições.hashCode());
    result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Dev other = (Dev) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (conteudosInscrições == null) {
      if (other.conteudosInscrições != null)
        return false;
    } else if (!conteudosInscrições.equals(other.conteudosInscrições))
      return false;
    if (conteudosConcluidos == null) {
      if (other.conteudosConcluidos != null)
        return false;
    } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
      return false;
    return true;
  }

}
