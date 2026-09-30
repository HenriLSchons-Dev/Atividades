public class Main{
    public static void main(String[] args) {
        Notificacao email = new NotificacaoEmail("Sua compra foi aprovada", "cliente@email.com");
        Notificacao sms = new NotificacaoSMS("Código de segurança: 1234", "11999998888");

        email.enviar();
        sms.enviar();
    }
}