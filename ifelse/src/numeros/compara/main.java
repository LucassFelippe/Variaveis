package numeros.compara;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Primeiro Número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        if (numero1 > numero2){
            System.out.println("Número:  " +numero1 + " é maior que " + numero2);
        } else if (numero1 == numero2) {
            System.out.println("Número: " +numero1 + " é igual a:  " + numero2);
        }else {
            System.out.println("O numero: " + numero2 + " é maior que: " + numero1);
        }
    }
}
