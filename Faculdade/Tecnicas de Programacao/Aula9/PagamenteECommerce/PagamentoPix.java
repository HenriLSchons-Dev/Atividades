public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        setChavePix(chavePix);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento PIX de R$ " + valor + " processado via chave: " + chavePix);
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}