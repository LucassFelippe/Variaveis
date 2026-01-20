package registro.notas;

public class Main {
    public static void main(String[] args) {
        Disciplina matematica = new Disciplina("Matematica");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);

        System.out.println("Total de notas válidas: " + matematica.contarNotasValidas());
        System.out.printf("Media em %s:%.2f\n", matematica.getDisciplina(), matematica.calculaMedia());
    }
}
