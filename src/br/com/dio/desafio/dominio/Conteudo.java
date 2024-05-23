package br.com.dio.desafio.dominio;
// quando digo que uma classe é abstrata, significa que não consigo criar o conteudo, não posso fazer fora dela isso: Conteudo conteudo = new Conteudo();

// mas porque foi criado então esse conteudo?
// para implementar esses atributos nas classes filhas
// HERANÇA

public abstract class Conteudo {
  protected static final double XP_PADRAO = 10d; // constante que ele é static, significa que posso acessa-lo fora da
                                                 // minha classe conteudo
  private String titulo;
  private String descricao;

  public abstract double calcularXp();

  public String getTitulo() {
    return titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

}
