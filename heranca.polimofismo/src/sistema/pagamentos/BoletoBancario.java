package sistema.pagamentos;

public class BoletoBancario extends  Pagamento{
    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento(){
        double calculaTaxa = valor * 0.01;
        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)\n",valor,calculaTaxa);
    }
}
