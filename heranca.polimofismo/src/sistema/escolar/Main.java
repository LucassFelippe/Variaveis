package sistema.escolar;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Julia", 16, 8.5);
        Aluno aluno2 = new Aluno("Caio", 17, 7.2);

        Docente docente1 = new Docente("Marta", 40, "Matematica");
        Docente docente2 = new Docente("Roberto", 38, "Hístoria");

        aluno1.exibirDados();
        aluno2.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
