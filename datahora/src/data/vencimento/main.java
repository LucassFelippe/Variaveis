package data.vencimento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
        String dataVencimento = "10-01-2025";
        int dataAdicionalMeses = 5;

        //Preciso converter a data de entrada para o nosso formato nomral dd-MM-yyyy pq o java reconhece outro formato yyyy-MM-dd que o java reconhece
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dataVencimentoL = LocalDate.parse(dataVencimento,formatoEntrada);
        LocalDate dataVencimentoPlus = dataVencimentoL.plusMonths(dataAdicionalMeses);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataVencimentoPlus.format(formatoData);

        System.out.println(dataFormatada);

    }
}
