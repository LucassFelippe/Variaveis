package calcula.notas;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double somaNotas = notas.stream()
                .reduce(0.0, Double::sum);

        double media = somaNotas / notas.size();

        double maiorNota = notas.stream()
                .max(Double::compare).get();

        double menorNota = notas.stream()
                .min(Double::compare).get();1

        System.out.println("A média das notas foi: " + media);
        System.out.println("A maior nota foi: " + maiorNota);
        System.out.println("A menor nota foi: " + menorNota );


    }
}
