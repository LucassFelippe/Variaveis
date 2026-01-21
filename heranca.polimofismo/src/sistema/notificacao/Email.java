package sistema.notificacao;

public class Email extends Notificacao {
    private String assunto;

    public Email(String destinatario,String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;


    }

    @Override
    void enviar(){
        System.out.println("Enviando Email para: " + getDestinatario());
        System.out.println("Assunto: " + assunto);
        System.out.println("Corpo: " + getMensagem() + "\n");
    }


}
