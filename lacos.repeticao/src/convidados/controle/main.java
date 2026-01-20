package convidados.controle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<String> convidados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a Lista, 'sair' para termiinar.)");
            String entrada = scanner.nextLine();

            //Encerrar
            if(entrada.equalsIgnoreCase("sair")){
                System.out.println("Programa Finalizado.");
                break;
            }

            //Ver Lista
            if (entrada.equalsIgnoreCase("ver")){
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            //Verificar se o nome já existe na lista (ignorando maiusculas e minusculas)

            boolean jaExiste = false;

            for (String nome : convidados){
                if (nome.equalsIgnoreCase(entrada)){
                    jaExiste = true;
                    break;
                }
            }

            if (jaExiste){
                System.out.println("O nome " + entrada + " já existe na lista de convidados.");
            } else{
                convidados.add(entrada);
                System.out.println(entrada + " foi adicionado a Lista de convidados");
            }
        }

        scanner.close();
    }
}
