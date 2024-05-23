import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso java");
    curso1.setDescricao("Descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso js");
    curso2.setDescricao("Descrição curso js");
    curso2.setCargaHoraria(4);

    /*
     * tudo que tem em conteudo tem no curso
     * porem nem tudo que tem no curso tem em conteudo
     * POLIMOFISMO
     * Conteudo conteudo = new Curso();
     * Conteudo conteudo1 = new Mentoria();
     * 
     * mas não posso chamar Conteudo conteudo = new Conteudo() pois ela é abstrata
     */

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de java");
    mentoria.setDescricao("Descrição mentoria java");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);

    System.out.println(mentoria);
  }

}
