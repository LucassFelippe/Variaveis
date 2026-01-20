package sistema.escolar;

public class Aluno extends Pessoa{
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }


    public void exibirDados() {
        System.out.println("Aluno: " + getNome() + " - idade: " + getIdade() + " - Nota: " + nota);
    }
}
