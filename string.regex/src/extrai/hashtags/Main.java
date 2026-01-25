package extrai.hashtags;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> hashtags = new ArrayList<>();

        while (matcher.find()){
            hashtags.add(matcher.group());
        }

        if (hashtags.isEmpty()){
            System.out.println("Nenhuma hashtag encontrada.");
        }else {
            System.out.println("Hashtags encontradas: " + String.join(", ", hashtags));
        }

        scanner.close();


    }
}
