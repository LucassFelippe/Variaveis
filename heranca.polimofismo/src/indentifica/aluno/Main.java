package indentifica.aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Fernanda", "regular");

        Bolsista aluno2 = new Bolsista("Lucas");

        aluno.identificar();
        aluno2.identificar();

    }
}
