package q1;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Curso> cursos = List.of(
                new Curso(1,"Informática", 400),
                new Curso(2, "Alimentos", 440),
                new Curso(3, "Apicultura", 380)
        );

        List<Aluno> alunos = List.of(
                new Aluno(1,"Yasmin"),
                new Aluno(2, "Pedro"),
                new Aluno(3, "Maria")
        );

        List<Professor> professores = List.of(
                new Professor(1,"Jeferson"),
                new Professor(2, "Rafael"),
                new Professor(3, "Sergio")
        );

        alunos.get(2).matricular(cursos.get(1));
        alunos.get(1).matricular(cursos.get(2));
        alunos.get(0).matricular(cursos.get(0));
        alunos.get(0).matricular(cursos.get(2));

        professores.get(0).atribuirCurso(cursos.get(1));
        professores.get(0).atribuirCurso(cursos.get(0));
        professores.get(1).atribuirCurso(cursos.get(2));
        professores.get(2).atribuirCurso(cursos.get(0));

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("Aluno: "+ aluno.getNome() +"\nCursos: " + aluno.getCursosMatriculado() + "\n\n");
        }


        for (int i = 0; i < professores.size(); i++) {
            Professor professor = professores.get(i);
            System.out.println("Professor: "+ professor.getNome() +"\nCursos: " + professor.getCursosMinistrados() + "\n\n");
        }

    }
}
