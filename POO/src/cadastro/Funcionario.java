package cadastro;

import java.util.Scanner;

public class Funcionario {

    String nome;
    String cargo;
    int nivel;

    public void atualizaDados(String novoCargo, int novoNivel){
        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("cargo: " + cargo);
        System.out.println("Nivel: " + nivel);

        cargo = novoCargo;
        nivel = novoNivel;

        System.out.println("--- Após atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel: " + nivel);
    }
}



