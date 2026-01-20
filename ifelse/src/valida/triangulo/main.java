package valida.triangulo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado A: ");
        int ladoA = scanner.nextInt();

        System.out.println("Digite o valor do lado B: ");
        int ladoB = scanner.nextInt();

        System.out.println("Digite o valor do lado C: ");
        int ladoC = scanner.nextInt();
        scanner.close();

        if( (ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA){
            System.out.println("OS lados podem formar um triagulo! ");
        }else {
            System.out.println("Não pode formar um triangulo!");
        }
    }
}
