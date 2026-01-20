package imprime.resumo;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Programador Pragmatico";
        livro.autor = "Dave Thomas";
        livro.paginas = 355;

        livro.exibeInformacoes();

    }
}
