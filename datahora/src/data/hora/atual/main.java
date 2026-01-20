package data.hora.atual;

import java.time.LocalDate;
import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
       String tarefa = "Enviar relatorio semanal";

        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        System.out.println("Tarefa: " + tarefa + "\"");
        System.out.println("Data Atual: " + data);
        System.out.println("Hora Atual: " + hora);
    }
}
