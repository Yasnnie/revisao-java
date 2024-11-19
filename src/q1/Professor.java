package q1;
import java.util.ArrayList;

public class Professor {
    private int id;
    private String nome;
    private ArrayList<Curso> cursosMinistrados = new ArrayList<Curso>();

    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void atribuirCurso(Curso curso) {
        cursosMinistrados.add(curso);
    }

    public  void desatriuirCurso(Curso curso) {
        cursosMinistrados.remove(curso);
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

    public ArrayList<Curso> getCursosMinistrados() {
        return cursosMinistrados;
    }

    public void setCursosMinistrados(ArrayList<Curso> cursos) {
        this.cursosMinistrados = cursos;
    }

}
