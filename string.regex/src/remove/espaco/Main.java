package remove.espaco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        String nomeFormatado = nome.trim();

        System.out.println(nomeFormatado);
        scanner.close();

    }
}
