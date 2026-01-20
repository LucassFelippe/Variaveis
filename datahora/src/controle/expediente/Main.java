package controle.expediente;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Entrada do usuário
        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);

        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHoraria = scanner.nextInt();

        System.out.print("Digite o horário real de saída (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(scanner.next(), formatter);

        scanner.close();

        // Cálculo da saída prevista
        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

        // Cálculo da diferença entre saída real e prevista
        Duration diferenca = Duration.between(saidaPrevista, saidaReal);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        // Exibição dos resultados formatados
        System.out.println("\nHorário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatter));
        System.out.println("Horário real de saída: " + saidaReal.format(formatter));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }
    }
}