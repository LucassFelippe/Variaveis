package controle.reserva;

public class Main {
    public static void main(String[] args) {
        Reserva r = new Reserva();

        r.reservar();
        r.reservar("10/04");
        r.reservar("12/04", 4);

        Reserva vip = new ReservaVip();
        vip.reservar();
    }
}
