package data.hora.relatorios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.now();
        LocalDate data = LocalDate.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = data.format(formatoData);
        String horaFormatada = hora.format(formatoHora);

        System.out.println(dataFormatada);
        System.out.println(horaFormatada);

    }
}
