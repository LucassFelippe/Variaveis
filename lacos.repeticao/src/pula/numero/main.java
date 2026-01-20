package pula.numero;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero ; i++) {

            if (i % 10 == 5 ){
                continue;
            }
            System.out.println(i);

        }
        scanner.close();
    }
}
