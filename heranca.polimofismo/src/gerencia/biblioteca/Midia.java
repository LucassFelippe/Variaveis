package gerencia.biblioteca;

public class Midia {
    private String titulo;
    private int ano;

    public Midia(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public void exibirInfo(){

        System.out.println("Código:LIB-" + titulo.substring(0, 3) + ano);
    }
}
