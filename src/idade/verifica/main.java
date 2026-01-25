package idade.verifica;

public class main {
    public static void main(String[] args) {
        int idade = 17;
        String mensagem;
        if (idade >= 18) {
             mensagem = "Você é maior de idade.";
        } else {
             mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);
    
    }
}