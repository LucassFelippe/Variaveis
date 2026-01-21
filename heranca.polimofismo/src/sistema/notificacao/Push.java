package sistema.notificacao;

public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    void enviar(){
        System.out.println("Enviando Push para: " + getDestinatario());
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + getMensagem() + "\n");
    }
}
