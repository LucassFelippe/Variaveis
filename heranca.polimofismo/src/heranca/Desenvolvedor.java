package heranca;

public class Desenvolvedor extends Funcionarios{
    private String stack;

    public Desenvolvedor(String nome, int salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }
}
