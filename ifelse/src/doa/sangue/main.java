package doa.sangue;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso do doador: ");
        int peso = scanner.nextInt();
        scanner.close();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso >= 50;

        if (idadeValida && pesoValido){
            System.out.println("Doador apto a receber sangue");
        } else{
            System.out.println("O doador não é compativel. Motivo: ");
            if (!idadeValida){
                System.out.println("- Deve ter entre 18 e 65 anos. ");
            }
            if (!pesoValido){
                System.out.println("- Deve ter mais de 50kg. ");
            }

        }

    }
}
