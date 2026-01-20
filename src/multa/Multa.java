package multa;

public class Multa {
    String titulo;
    int diasAtraso;

    public void exibirDetalhes(){
        double calcula = diasAtraso * 2.50;

        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f",titulo,diasAtraso,calcula);

    }
}
