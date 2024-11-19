package q5;
import java.util.ArrayList;

public class Empresa <T extends Funcionario>{
    private ArrayList<T> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(T funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(T funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        for (T funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
