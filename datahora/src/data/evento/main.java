package data.evento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2027, 1, 4);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formatoDataAtual = dataAtual.format(formatter);
        String formatoDataEvento = dataEvento.format(formatter);
        
        if (dataEvento.equals(dataAtual)){
            System.out.println("Data correta ");
        } else if (dataEvento.isBefore(dataAtual)) {
            System.out.println("Data do evento " + formatoDataEvento);
            System.out.println("Data atual: " + formatoDataAtual);
            System.out.println("O evento ja ocorreu ");
        } else if (dataEvento.isAfter(dataAtual)) {
            System.out.println("Data do evento " + formatoDataEvento);
            System.out.println("Data atual: " + formatoDataAtual);
            System.out.println("O evento ainda vai ocorrer ");
        }
    }
}
