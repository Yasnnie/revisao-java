package q3;

import java.util.ArrayList;

public class Biblioteca <T extends Publicacao> {

    private ArrayList<T> publicacoes;

    public Biblioteca() {
        this.publicacoes = new ArrayList<>();
    }

    public void adicionarPublicacao(T publicacao) {
        publicacoes.add(publicacao);
    }

    public void removerPublicacao(T publicacao) {
        publicacoes.remove(publicacao);
    }

    public void listarPublicacoes() {
        for (T publicacao : publicacoes) {
            System.out.println(publicacao.obterResumo() + "\n\n");
        }
    }

}
