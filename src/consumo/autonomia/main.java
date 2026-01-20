package consumo.autonomia;

public class main {
    public static void main(String[] args) {
        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        //double validaAutonomia = autonomiaAtual - distanciaViagem;

        System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima);
        System.out.println("Autonomia atual: " + autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem){
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        }else   {
            System.out.println("Você vai precisar abastecer o tanque.");
        }
    }
}
