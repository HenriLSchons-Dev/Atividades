public class NotificacaoSMS extends Notificacao {
    private String numeroTelefone;

    public NotificacaoSMS(String mensagem, String numeroTelefone) {
        super(mensagem);
        setNumeroTelefone(numeroTelefone);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para " + numeroTelefone + ": " + mensagem);
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

}