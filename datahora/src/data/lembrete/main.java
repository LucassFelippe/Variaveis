package data.lembrete;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class main {
    public static void main(String[] args) {
      LocalDate dataVencimento = LocalDate.of(2025, 3, 30);
       int antecedencia = 5;

       LocalDate dataLembrete = dataVencimento.minusDays(antecedencia);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataLembrete.format(formatter);

        System.out.println("Data do lembrete: " + dataFormatada);
    }
}
