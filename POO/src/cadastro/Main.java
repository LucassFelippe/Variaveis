package cadastro;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Júlia Oliveira";
        f1.cargo = "Pessoa desenvolvedora Junior";
        f1.nivel = 1;

        f1.atualizaDados("Desenvolvedor Pleno", 2);

    }
}
