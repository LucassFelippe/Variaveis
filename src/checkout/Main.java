package checkout;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Checkout i1 = new Checkout();
        i1.nome = "Teclado";
        i1.preco = 120.0;
        i1.quantidade = 1;

        Checkout i2 = new Checkout();

        i2.nome = "Mause";
        i2.preco = 60.0;
        i2.quantidade = 2;

        List<Checkout> carrinho = new ArrayList<>();

        carrinho.add(i1);
        carrinho.add(i2);

        double totalCompra = 0;

        for (Checkout item : carrinho){
            totalCompra += item.calculaValorTotal();
        }

        System.out.printf("Total da compra: %.2f\n", totalCompra);
    }
}
