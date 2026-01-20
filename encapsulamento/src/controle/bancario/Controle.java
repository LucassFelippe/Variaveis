package controle.bancario;

public class Controle {
    private  String titular;
    private double  saldo;


    public Controle(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar (double deposito){
        if (deposito > 0){
            this.saldo += deposito;
        } else{
            System.out.println("Deposito invalido!");
        }

    }

    public void sacar(double saque){
        if (saque > this.saldo){
            System.out.println("Saldo insuficiente");
        }else {
          this.saldo  -= saque;
        }
    }

    public void exibeSaldo(){
        System.out.printf("Saldo atual de %s: R$ %.2f", titular, saldo);
    }

}
