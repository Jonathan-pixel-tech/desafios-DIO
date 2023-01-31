import java.time.LocalDate;
import java.util.Scanner;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
public class Main {
    final static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Descrição curso javaScript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mnetoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());
        /* 
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Devoleper");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos: " + devCamila.getConteudosInscritos());

        Dev DevJonathan = new Dev();
        DevJonathan.setNome("Nome");
        DevJonathan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos: " + DevJonathan.getConteudosInscritos());
        DevJonathan.progredir();
        DevJonathan.progredir();
        DevJonathan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jonathan:" + DevJonathan.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jonathan:" + DevJonathan.getConteudosConcluidos());
        System.out.println("XP:" + DevJonathan.calcularTotalXp());








    }
}