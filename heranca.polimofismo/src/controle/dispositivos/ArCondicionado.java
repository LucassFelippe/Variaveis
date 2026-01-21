package controle.dispositivos;

public class ArCondicionado implements Controlavel{
    boolean ligado = false;

    @Override
    public void ligar(){
        if (!ligado){
            ligado = true;
            System.out.printf("Ar-condicionado ligado.");
        } else if (!ligado) {
            System.out.printf("Ar-condicionado já está ligado");

        }
    };

    @Override
    public  void desligar(){
        if (ligado){
            ligado = false;
            System.out.printf("Ar-condicionado desligado!");
        } else  {
            System.out.printf("Ar-condicionado já está desligado");

        }
    };
}
