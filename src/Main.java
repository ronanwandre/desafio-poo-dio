import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
            Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

            Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição mentoria Java", LocalDate.now());

            Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devCamila = new Dev("Camila");
            devCamila.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
            devCamila.progredir();
            devCamila.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
            System.out.println("XP: " + devCamila.calcularTotalXp());

            System.out.println("-------");

            Dev devJoao = new Dev("João");
            devJoao.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
            devJoao.progredir();
            devJoao.progredir();
            devJoao.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
            System.out.println("XP: " + devJoao.calcularTotalXp());
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
