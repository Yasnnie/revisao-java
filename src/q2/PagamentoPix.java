package q2;

public class PagamentoPix  implements Pagamento{
    @Override
    public boolean processarPagamento(double valor){
        System.out.println("Pagamento Pix realizado no valor de: R$"+valor);
        return true;
    }
}
