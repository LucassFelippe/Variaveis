package produto.relatorio;

public class main {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "PlayStation";
        produto.preco = 2500;
        produto.quantidade = 1;

        produto.exibeInformacoes();

    }
}
