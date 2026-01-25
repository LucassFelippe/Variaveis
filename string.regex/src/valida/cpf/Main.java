package valida.cpf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();

        String regex = "\\d{3}\\.\\d{3}.\\d{3}-\\d{2}";

        if (cpf.matches(regex)){
            System.out.println("O CPF " + cpf + " está no formato válido.");
        }else {
            System.out.println("O CPF " + cpf + " não está no formato válido.");
        }
        scanner.close();
    }
}
