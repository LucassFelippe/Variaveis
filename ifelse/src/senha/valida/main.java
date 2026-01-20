package senha.valida;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String senhaSalva = "2001#Lucasf";
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Digite sua senha: ");

        String senhaDigitada = scanner.nextLine() ;
        scanner.close();

        if (senhaSalva.equals(senhaDigitada)){
            System.out.println("Acesso Permitido");
        }else {
            System.out.println("Acesso Negado");
        }
    }
}
