package heranca;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lucas", 12000);

        gerente.exibirInformacoes();
        gerente.reajuste(2);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas", 15000, "Java Backend");

        desenvolvedor.exibirInformacoes();
        desenvolvedor.reajuste(2);


    }
}
