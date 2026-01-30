package calcula.imposto;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        Double totalProdutos = precosProdutos.stream()
                .reduce(0.0, Double::sum);

       double imposto = totalProdutos * 0.08;
        double totalComImposto = totalProdutos + imposto;

        System.out.println("Valor total antes do imposto: " + totalProdutos);
        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", totalComImposto));
    }
}
