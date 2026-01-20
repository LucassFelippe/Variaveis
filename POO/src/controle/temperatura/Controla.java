package controle.temperatura;

public class Controla {
    String local;
    double temp;

    public void exibeLocal(){
        System.out.printf("Sensor no Local: %s \n", local );
    }

    public void exibeTemp(){
        System.out.printf("Temperatura: %.1f: \n", temp);
    }

    public void alerta(){
        if (temp > 37.5){
            System.out.println("Alerta: Temperatura acimda do limite!");
        }
    }
}
