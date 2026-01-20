package controle.senha;

public class Senha {
    private String senhaAtual;

    public Senha(String senhaAtual) {
        this.senhaAtual = senhaAtual;
    }

    public void setSenhaAtual(String senhaAtualInformada,String novaSenha) {
        if(this.senhaAtual.equals(senhaAtualInformada)){
            System.out.println("Senha alterada com sucesso!");
            this.senhaAtual = novaSenha;
        } else{
            System.out.println("Senha invalida!");
        }
    }

    public String getSenhaAtual() {
        return senhaAtual;
    }
}
