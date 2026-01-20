package compras.desconto;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        scanner.close();

        if(valorCompra >= 100){
            double desconto = valorCompra * 0.10;
            double valorFinal = valorCompra - desconto;
            System.out.println("Desconto aplicado de 10%, o valor final da compra ficou: " + valorFinal);
        }else {
            System.out.println("Desconto não aplicado. Valor da compra: " + valorCompra);
        }

    }
}
