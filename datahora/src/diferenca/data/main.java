package diferenca.data;

import javax.xml.transform.Source;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LocalTime inicio = LocalTime.of(7, 00);
        LocalTime fim = LocalTime.of(17, 00);

        Duration duration = Duration.between(inicio, fim);

        System.out.println("Diferença de tempo: " + duration.toHours() + " e " + duration.toMinutesPart() + " minutos");
    }
}
