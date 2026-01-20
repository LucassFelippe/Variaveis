package data.entrega;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.now();
        int prazoDias = 15;
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = dataEntrega.format(formatoData);

        System.out.println("Data de entrega: " + dataFormatada);


    }
}
