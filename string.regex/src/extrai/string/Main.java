package extrai.string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String arquivo = scanner.nextLine();

        int posicaoPonto = arquivo.lastIndexOf(".");

        if (posicaoPonto != -1){
            String nomeSemExtensao = arquivo.substring(0,posicaoPonto);
            System.out.println("Nome do arquivo sem extensao: " + nomeSemExtensao);
        }else {
            System.out.println("O arquivo não possui extensão.");
        }

        scanner.close();
    }
}
