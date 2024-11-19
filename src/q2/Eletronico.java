package q2;

public class Eletronico extends Produto {

    public Eletronico(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public double cacularDesconto() {
        return this.getPreco() * 0.9;
    }
}
