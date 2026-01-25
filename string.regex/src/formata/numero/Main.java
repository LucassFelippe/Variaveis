package formata.numero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();

        System.out.printf("Valor formatado: R$ %.2f",valor);

    }
}
