public class NotificacaoEmail extends Notificacao {
    private String emailDestino;

    public NotificacaoEmail(String mensagem, String emailDestino) {
        super(mensagem);
        setEmailDestino(emailDestino);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Email para " + emailDestino + ": " + mensagem);
    }

    public String getEmailDestino() {
        return emailDestino;
    }

    public void setEmailDestino(String emailDestino) {
        this.emailDestino = emailDestino;
    }

}