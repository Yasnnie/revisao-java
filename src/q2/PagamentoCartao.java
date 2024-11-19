package q2;

public class PagamentoCartao implements Pagamento {

    @Override
    public boolean processarPagamento(double valor){
        System.out.println("Pagamento Cartão realizado no valor de: R$"+valor);
        return true;
    }
}
