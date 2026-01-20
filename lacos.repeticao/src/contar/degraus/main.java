package contar.degraus;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int degraus = scanner.nextInt();

        for (int i = 1; i <= degraus ; i++) {
            System.out.println("Subiu o degrau " + i);
        }
        System.out.println("Você Chegou ao topo!");
        scanner.close();
    }
}
