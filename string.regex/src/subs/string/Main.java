package subs.string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto:  ");
        String textoP = scanner.nextLine();

        System.out.println("Digite a palavra a ser substituída: ");
        String palavraTrocar = scanner.nextLine();

        System.out.println("Digite a nova palavra: ");
        String novaPalavra = scanner.nextLine();

        if (!textoP.contains(palavraTrocar)){
            System.out.println("A Palavra não foi encontrada no texto!");
            scanner.close();
            return;
        }


        System.out.println("Texto atualizado!");
        String textoFormatado = textoP.replace(palavraTrocar, novaPalavra);
        System.out.println(textoFormatado);



    }
}
