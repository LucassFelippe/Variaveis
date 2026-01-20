package valida.login;

public class Login {

    private String login;
    private String senha;

    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validarSenha (String login, String senha){
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public String getLogin(){
        return this.login;
    }
}
