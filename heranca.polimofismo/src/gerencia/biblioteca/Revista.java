package gerencia.biblioteca;

public class Revista extends Midia {
    private String edicao;

    public Revista(String titulo, int ano, String edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    public void exibirInfo(){
        System.out.println("Código: LIB-" + getTitulo().substring(0,3) + getAno() + " - Edição: " + edicao);
    }
}
