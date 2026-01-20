package indentifica.aluno;

public class Aluno {
    private String aluno;
    private String tipo;

    public Aluno(String aluno, String tipo) {
        this.aluno = aluno;
        this.tipo = tipo;
    }

    public void identificar(){
        System.out.println("Aluno: " + aluno + " - Tipo: " + tipo);
    }

}
