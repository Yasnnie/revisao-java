package q5;

public abstract class Funcionario {
    private int id;
    private String nome;
    private double salarioBase;

    public Funcionario(int id, String nome, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();


    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nSalário: R$"+ this.calcularSalario() + "\n========================";
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
