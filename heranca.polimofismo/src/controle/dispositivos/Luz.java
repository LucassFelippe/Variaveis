package controle.dispositivos;

public class Luz implements Controlavel{
    boolean ligado = false;

    @Override
    public void ligar(){
        if (!ligado){
            ligado = true;
            System.out.printf("Luz Ligada\n");
        } else  {
            System.out.printf("Luz já está Ligada\n");

        }
    };

    @Override
    public  void desligar(){
        if (ligado){
            ligado = false;
            System.out.printf("Luz desligada!\n");
        } else  {
            System.out.printf("Luz já está desligada");

        }
    };
}
