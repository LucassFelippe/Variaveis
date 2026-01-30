package chave.existe;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        int idCliente = 6;

        if (clientes.containsKey(idCliente)){
            String nome = clientes.get(idCliente);

            System.out.println("O nome do cliente com ID 5 é: " + nome);
        }else {
            System.out.println("Cliente com o ID " + idCliente + " não encontrado." );
        }


    }
}
