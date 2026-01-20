package produtos.classificacao;

public class main {
    public static void main(String[] args) {
        double preco = 150.00;
        String categoriaEconomica = "Econômico";
        String categoriaIntermediaria = "Intermediário";
        String categoriaPremium = "Premium";

        if(preco <= 50){
            System.out.println("Categoria do produto: "+ categoriaEconomica);
        } else if (preco > 50 && preco <= 200){
            System.out.println("Categoria do produto: "+ categoriaIntermediaria);
        }else {
            System.out.println("Categoria do produto: "+ categoriaPremium);
        }
    }
}
