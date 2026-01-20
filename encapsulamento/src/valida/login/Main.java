package valida.login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Login login = new Login("aluno@2025", "escola@123");

        int tentativasRestantes = 3;

        while (tentativasRestantes > 0){
            System.out.println("Digite seu usuario: ");
            String usuario = scanner.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (login.validarSenha(usuario,senha)){
                System.out.println("Login bem-sucedido");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes == 0){
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                }else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }
        scanner.close();
    }
}
