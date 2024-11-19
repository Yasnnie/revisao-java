package q3;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A Seleção", "Kiera Cass", 2012);
        Livro livro2 = new Livro("Quem é você Alasca?", "John Green", 2005);
        Livro livro3 = new Livro("Cidades de papel", "John Green", 2015);

        Revista revista1 = new Revista("New York Times", "Yasmin", 2022);
        Revista revista2 = new Revista("VEJA", "Pedro", 2002);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarPublicacao(livro1);
        biblioteca.adicionarPublicacao(livro2);
        biblioteca.adicionarPublicacao(livro3);
        biblioteca.adicionarPublicacao(revista1);
        biblioteca.adicionarPublicacao(revista2);

        biblioteca.listarPublicacoes();

        biblioteca.removerPublicacao(livro3);
        biblioteca.listarPublicacoes();
    }
}
