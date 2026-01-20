package controle.bateria;

public class Main {
    public static void main(String[] args) {
         Bateria b = new Bateria();

         b.setNivelBateria(80);

        System.out.println("Status: " + b.exibeStatus());

    }
}
