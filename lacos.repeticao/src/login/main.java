package login;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String SENHA_CORRETA = "1234";

        for (int tentativas = 3; tentativas > 0; tentativas--){
            System.out.println("Digite sua senha: ");
            String senha = scanner.nextLine();
            System.out.println(tentativas);

            if(senha.equals(SENHA_CORRETA)){
                System.out.println("Senha correta! Acesso Liberado!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Voce tem " + (tentativas - 1 ) + " tentativas");
            }else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
    }
}
