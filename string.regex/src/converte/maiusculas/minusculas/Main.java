package converte.maiusculas.minusculas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        String textoM = texto.toUpperCase();
        String textoMin = texto.toLowerCase();

        System.out.println(textoM);
        System.out.println(textoMin);
    }
}
