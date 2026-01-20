package controle.senha;

public class Main {
    public static void main(String[] args) {
        Senha alteraSenha = new Senha("123456");
        alteraSenha.setSenhaAtual("123456", "2001#Lucasf");

        System.out.println("Senha atual: " + alteraSenha.getSenhaAtual());
    }
}
