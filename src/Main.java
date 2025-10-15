import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(java.time.LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JavaScript");
        mentoria2.setDescricao("Descrição mentoria JavaScript");
        mentoria2.setData(java.time.LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(mentoria2);
        
    }
    
}
