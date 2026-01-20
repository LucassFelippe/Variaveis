package agenda.contatos;

public class Agenda {
    private String nome;
    private  String numero;

    public Agenda(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}
