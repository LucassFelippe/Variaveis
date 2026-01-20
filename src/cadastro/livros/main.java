package cadastro.livros;

public class main {
    public static void main(String[] args) {
        String titulo = "O Pequeno Principe";
        String autor = "Antonie De Saint-Exupéry";
        int numeroDePaginas = 96;
        double precoLivro = 39.9;
        char categoria = 'F';

        String categoriaDescricao ;

        if (categoria == 'F'){
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N'){
            categoriaDescricao = "Não-Ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "História";
        } else {

            categoriaDescricao = "Categoria Invalida";
        }

        System.out.println("Livro cadastrado: \" " + titulo + "\", de " + autor + ". Ele Possui " + numeroDePaginas + " páginas, custa R$ " + precoLivro + " e pertence á categoria " + categoriaDescricao + ".");
    }
}
