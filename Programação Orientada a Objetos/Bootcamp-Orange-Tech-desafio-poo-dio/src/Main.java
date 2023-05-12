import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        //System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now()); //vai abribuir a data de criação ao ser chamado

        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devCamila.getConteudosConcluidos());
        System.out.println("XP " + devCamila.calcularTotalXp());

        System.out.println("-----");

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devJose.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devJose.getConteudosConcluidos());
        System.out.println("XP " + devJose.calcularTotalXp());




    }
}