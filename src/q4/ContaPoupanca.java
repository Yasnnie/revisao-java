package q4;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numeroDaConta, String titular, double saldo) {
        super(numeroDaConta, titular, saldo);
    }

    public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        Transacao t = new Transacao();
        if( valor > 50000) throw  new ValorInvalidoException("Conta poupança não pode sacar esse valor");

        t.sacar(valor, this);

    }

    public void depositar(double valor) throws ValorInvalidoException {
        Transacao t = new Transacao();
        t.depositar(valor, this);
    }

}
