package controle.temperatura;

public class Main {
    public static void main(String[] args) {
        Controla controla = new Controla();

        controla.local = "Setor A";
        controla.temp = 39.2;

        controla.exibeLocal();
        controla.exibeTemp();
        controla.alerta();
    }

}
