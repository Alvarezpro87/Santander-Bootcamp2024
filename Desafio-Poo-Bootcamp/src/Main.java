import br.com.alex.desafio.dominio.model.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setDescricao("descrição para o java");
        curso.setTitulo("java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setDescricao("descrição para o Spring");
        curso1.setTitulo("spring");
        curso1.setCargaHoraria(8);


        System.out.println(curso );
        System.out.println(curso1 );
    }
}