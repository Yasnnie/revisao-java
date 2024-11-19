package q1;
import java.util.ArrayList;

public class Aluno {
    private int id;
    private String nome;
    private ArrayList<Curso> cursosMatriculado = new ArrayList<Curso>();

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void matricular(Curso curso) {
        this.cursosMatriculado.add(curso);
    }

    public void desmatricular(Curso curso) {
        this.cursosMatriculado.remove(curso);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> getCursosMatriculado() {
        return cursosMatriculado;
    }

    public void setCursosMatriculado(ArrayList<Curso> cursos){
        this.cursosMatriculado = cursos;
    }
}
