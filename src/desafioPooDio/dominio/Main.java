package desafioPooDio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso POO");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao Curso JavaScript");
        curso2.setCargaHorario(10);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria POO");
        mentoria.setDescricao("Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
