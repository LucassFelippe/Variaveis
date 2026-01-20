package dia.util;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana ( letras minusculas): ");
        String dia = scanner.nextLine().toLowerCase();
        scanner.close();

       if (dia.equals("segunda")|| dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")){;
        System.out.println(dia + " é um dia util ");
       }else{
        System.out.println(dia + " não é um dia util ");
    }}
}
