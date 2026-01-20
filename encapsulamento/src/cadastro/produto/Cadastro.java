package cadastro.produto;

public class Cadastro {
    private String nome;
    private  double preco;

    public Cadastro(String nome, double preco) {
        this.nome = nome;
        if (preco <= 0){
            System.out.println("Preço invalido");
            this.preco = 0.00;
        }else {
            this.preco = preco;
        }

    }


    public void exibeCadastro(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
    }

}
