package avaliacoes.filmes;

public class Main {
    public static void main(String[] args) {
        Avalia matrix = new Avalia("Matrix");
        matrix.adicionarAvalicao(5);
        matrix.adicionarAvalicao(4);
        matrix.adicionarAvalicao(5);
        matrix.adicionarAvalicao(3);
        matrix.adicionarAvalicao(4);

        System.out.printf("Média de avaliações para %s: %.2f\n",
                matrix.getTitulo(), matrix.calculaMedia());
    }
}
