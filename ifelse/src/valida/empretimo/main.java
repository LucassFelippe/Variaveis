package valida.empretimo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do emprestimo: ");
        int valorEmprestimo = scanner.nextInt();
        scanner.close();

        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000){
            System.out.println("Valor permitido");
        }else {
            System.out.println(" O valor: " + valorEmprestimo + ", não está dentro do intervalo permitido.");
        }
    }
}
