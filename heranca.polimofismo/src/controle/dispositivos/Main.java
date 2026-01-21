package controle.dispositivos;

public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        ArCondicionado arCondicionado = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        arCondicionado.desligar();
    }
}
