import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso Java");
    curso1.setDescricao("descricao curso Java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso JavaScript");
    curso2.setDescricao("descricao JavaScript");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria Java");
    mentoria.setDescricao("descricao Java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descricao Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devJoao = new Dev();
    devJoao.setNome("Joao");
    devJoao.inscrever(bootcamp);
    System.out.println("Conteudos Inscritos - Joao: " + devJoao.getConteudosInscritos());

    devJoao.progredir();
    devJoao.progredir();
    devJoao.progredir();

    System.out.println("Conteudos Inscritos - Joao: " + devJoao.getConteudosInscritos());
    System.out.println("Conteudos Concluidos - Joao: " + devJoao.getConteudosConcluidos());
    System.out.println("XP - Joao: " + devJoao.calcularTotalXP());

    System.out.println("------------------------------------------");

    Dev devMaria = new Dev();
    devMaria.setNome("Maria");
    devMaria.inscrever(bootcamp);
    System.out.println("Conteudos Inscritos - Maria: " + devMaria.getConteudosInscritos());

    devMaria.progredir();
    devMaria.progredir();

    System.out.println("Conteudos Concluidos - Maria: " + devMaria.getConteudosConcluidos());
    System.out.println("XP - Maria: " + devMaria.calcularTotalXP());

  }
}
