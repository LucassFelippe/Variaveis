package gerencia.biblioteca;

public class Ebook extends Midia {
    private String formato;

    public Ebook(String titulo, int ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }

    public void exibirInfo(){
        System.out.println("Código: LIB-" + getTitulo().substring(0,3) + getAno() + " - Formato: " + formato);
    }
}
