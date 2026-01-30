package remove.elements;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Joana");
        nomes.add("Lucas");
        nomes.add("Pedro");
        nomes.add("Antônio");
        System.out.println("Lista inicial: " + nomes);

        nomes.remove("Pedro");

        System.out.println("Lista final: " + nomes);



    }
}
