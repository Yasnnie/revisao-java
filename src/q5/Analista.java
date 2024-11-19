package q5;

public class Analista extends Funcionario implements Bonus {

    public Analista(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + calcularBonus(5.0);
    }

    @Override
    public double calcularBonus(double percentual) {
        return this.getSalarioBase() * percentual / 100;
    }
}