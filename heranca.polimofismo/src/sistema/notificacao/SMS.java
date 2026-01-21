package sistema.notificacao;

public class SMS extends  Notificacao{
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    void enviar(){
        System.out.println("Enviando SMS para: " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem() + "\n");
    }
}
