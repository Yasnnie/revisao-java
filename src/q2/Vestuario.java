package q2;

public class Vestuario extends Produto {

    public Vestuario(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public double cacularDesconto() {
        return this.getPreco() * 0.8;
    }
}
