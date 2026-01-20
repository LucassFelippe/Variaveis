package controle.estoque;

public class Main {
    public static void main(String[] args) {

        Estoque item = new Estoque();
        item.nome = "Camiseta";
        item.quantidade = 10;

        item.vender(3);
        item.vender(8);
    }
}
