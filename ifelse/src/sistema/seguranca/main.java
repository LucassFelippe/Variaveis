package sistema.seguranca;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCorreto = 2023;

        int nivelPermissaoMinimo = 1;
        int nivelPermissaoMaximo = 3;

        System.out.println("Digite o código de acesso: ");
        int codigo = scanner.nextInt();

        System.out.println("Dogite o nivel de permissão: ");
        int permissao = scanner.nextInt();
        scanner.close();

        boolean validaCodigo =  codigo == codigoCorreto;
        boolean validaPermissao = permissao >= nivelPermissaoMinimo && permissao <= nivelPermissaoMaximo;

        if (validaCodigo && validaPermissao){
            System.out.println("Acesso permitido. Bem-vindo ao sistema! ");
        }else {
            System.out.println("Acesso negado");
            if (!validaCodigo){
                System.out.println("Codigo incorreto.");
            }
            if (!validaPermissao){
                System.out.println("Permissao negada.");
            }
        }
    }
}
