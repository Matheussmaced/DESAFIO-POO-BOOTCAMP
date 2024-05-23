package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
  private String nome;
  private Set<Conteudo> conteudosInscrições = new LinkedHashSet<>(); // enquanto vou se escrevendo no curso, quero que
                                                                     // sejam salvos, que coloquem na mesma ordem
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // quero que quando concluidos, sejam colocados na
                                                                     // ordem
  // metodos

  public void inscreverBootcamp(Bootcamp bootcamp) {
  }

  public void progredir() {
  }

  public void calcularXp() {
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
