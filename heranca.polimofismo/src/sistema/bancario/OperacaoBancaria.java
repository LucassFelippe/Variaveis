package sistema.bancario;

abstract class OperacaoBancaria implements AcaoBancaria {
   protected double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }

}
