package checkout;

public class Checkout {
    String nome;
    double preco;
    int quantidade;

    double calculaValorTotal(){
        return preco * quantidade;
    }


}
