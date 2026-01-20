package maior.numero;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço: ");
        String[] numerosStr = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numerosStr){
            int num = Integer.parseInt(numStr);
            if(num > maior){
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}
