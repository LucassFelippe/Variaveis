package zera.saldo;

public class SaldoConta {
    double saldo;


    public void exibeSaldo(){
        System.out.printf("Saldo atual: R$%.2f \n", saldo);

    }
    public void zeraSaldo(){
        saldo = 0;
    }


}
