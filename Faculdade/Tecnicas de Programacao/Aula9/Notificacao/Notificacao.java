public abstract class Notificacao {
    protected String mensagem;

    public Notificacao(String mensagem) {
        setMensagem(mensagem);
    }

    public abstract void enviar();

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}