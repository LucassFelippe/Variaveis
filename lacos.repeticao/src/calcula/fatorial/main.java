package calcula.fatorial;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int fator = 1;

        for (int i = 1; i <= numero  ; i++){
            fator *= i;

        }
        System.out.println("O fatorial de " + numero + " é: " + fator);

    }
}
