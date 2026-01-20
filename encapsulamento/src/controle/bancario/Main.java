package controle.bancario;

public class Main {
    public static void main(String[] args) {
        Controle conta = new Controle("Ana");
        conta.depositar(1000.00);
        conta.sacar(100.00);
        conta.exibeSaldo();
    }
}
