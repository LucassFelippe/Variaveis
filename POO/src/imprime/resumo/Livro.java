package imprime.resumo;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public void exibeInformacoes(){
        System.out.printf("%s de %s com %d páginas.", titulo, autor, paginas);
    }

}
