package q5;

public class Main {
    public static void main(String[] args) {

        Analista funcionario = new Analista(1,"Yasmin", 2000.0);
        Gerente funcionario2 = new Gerente(2,"Silva", 3000.0);

        Empresa empresa  = new Empresa();

        empresa.adicionarFuncionario(funcionario);
        empresa.adicionarFuncionario(funcionario2);

        empresa.listarFuncionarios();

        empresa.removerFuncionario(funcionario);
        empresa.listarFuncionarios();
    }
}
