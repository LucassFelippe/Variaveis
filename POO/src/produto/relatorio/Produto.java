package produto.relatorio;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void exibeInformacoes(){
        System.out.printf(" Produto: %s \n Preço: %.2f \n Quantidade: %d ", nome, preco, quantidade);
    }
}
