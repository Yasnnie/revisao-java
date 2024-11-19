package q4;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numeroDaConta, String titular, double saldo) {
        super(numeroDaConta, titular, saldo);
    }

    public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        Transacao t = new Transacao();
        double valorSaque = valor + valor * 0.1;
        t.sacar(valorSaque, this);
    }

    public void depositar(double valor) throws ValorInvalidoException {
        Transacao t = new Transacao();
        t.depositar(valor, this);
    }
}
