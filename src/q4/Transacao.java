package q4;

public class Transacao {

    public void sacar(double valor, Conta conta) throws SaldoInsuficienteException, ValorInvalidoException {
        if(valor <= 0) throw  new ValorInvalidoException("Valor inválido");

        if( valor> conta.getSaldo())throw new SaldoInsuficienteException("Saldo insuficiente");

        conta.setSaldo(conta.getSaldo() - valor);
    }

    public void depositar(double valor, Conta conta) throws ValorInvalidoException {
         if(valor <= 0)throw new ValorInvalidoException("Valor inválido");

         conta.setSaldo(conta.getSaldo() + valor);
    }
}
