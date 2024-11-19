package q2;

public class Main {
    public static void main(String[] args) {
        Eletronico produto1 = new Eletronico(1,"Iphone 13", 4597.99);
        Eletronico produto2 = new Eletronico(2,"Roku Express", 169.90);

        Vestuario produto3 = new Vestuario(1,"Tênis Nike Court Vision", 360.99);
        Vestuario produto4 = new Vestuario(1,"Camisa Hering", 62.90);


        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        PagamentoPix pagamentoPix = new PagamentoPix();


        pagamentoCartao.processarPagamento(produto1.getPreco());
        pagamentoPix.processarPagamento(produto2.getPreco());
        pagamentoCartao.processarPagamento(produto3.getPreco());
        pagamentoPix.processarPagamento(produto4.getPreco());
    }
}
