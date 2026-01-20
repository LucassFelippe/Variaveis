package heranca;

public class Funcionarios {
    private String nome;
    private double salario;

    public Funcionarios(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes(){
        System.out.printf("Nome do funcionario: %s, Salario: %.2f", nome, salario);
    }

    public void reajuste(int percentual){
        salario += percentual * (salario / 100);

        System.out.printf("\nnovo salrio de %s é %.2f\n", nome, salario);


    }
}
