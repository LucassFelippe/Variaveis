package controle.reserva;

public class Reserva {

    public void reservar(){
        System.out.println("Reserva Realizada");
    }

    public void reservar(String data){
        System.out.println("Reserva feita para o dia: " + data);
    }

    public void  reservar(String data, int pessoas){
        System.out.printf("Reserva feita para o dia: %s para %d pessoas",data,pessoas);
    }


}
