import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

    /*
     * System.out.println(curso1);
     * System.out.println(curso2);
     * System.out.println(mentoria);
     */

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devMatheus = new Dev();
    devMatheus.setNome("Matheus");
    devMatheus.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos: " + devMatheus.getConteudosInscrições());
    devMatheus.progredir();
    devMatheus.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos: " + devMatheus.getConteudosInscrições());
    System.out.println("Conteúdos Concluídos: " + devMatheus.getConteudosConcluidos());
    System.out.println("XP: " + devMatheus.calcularXp());

    System.out.println("------------------");

    Dev devJoao = new Dev();
    devJoao.setNome("João");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscrições());
    devJoao.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscrições());
    System.out.println("Conteúdos Concluidos: " + devJoao.getConteudosConcluidos());
    System.out.println("XP: " + devJoao.calcularXp());

  }

}
