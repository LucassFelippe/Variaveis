package sistema.pagamentos;

public class CartaoCredito extends Pagamento{
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento(){

        double calculaTaxa = valor * 0.03;
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)\n",valor,calculaTaxa);
    }
}
