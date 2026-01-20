package gerencia.biblioteca;

public class Livro extends Midia {
    private String autor;

    public Livro(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    public void exibirInfo(){
        System.out.println("Código: LIB-" + getTitulo().substring(0,3) + getAno() + " - Autor: " + autor);

    }
}
