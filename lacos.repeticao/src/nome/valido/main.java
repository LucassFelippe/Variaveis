package nome.valido;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String nome;

        do {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
            if (nome.length() < 3){
                System.out.println("Nome invalido. Digite novamente.");
            }
        }while (nome.length() < 3 );{
            System.out.println("Nome \"" + nome + "\" cadastro com sucesso! " );
            scanner.close();
        }



    }
}
