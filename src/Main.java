import br.com.dio.Bootcamp;
import br.com.dio.Conteudo;
import br.com.dio.Dev;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Amanda" + devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        devAmanda.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Amanda" + devAmanda.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Amanda" + devAmanda.getConteudosInscritos());
        System.out.println("XP" +devAmanda.calcularTotalXp());

        System.out.println("------");

        Dev devNicolas = new Dev();
        devNicolas.setNome("Nicolas");
        devNicolas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nicolas" +devNicolas.getConteudosInscritos());
        devNicolas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nicolas" +devNicolas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Nicolas" +devNicolas.getConteudosInscritos());
        System.out.println("XP" +devNicolas.calcularTotalXp());
    }
}
