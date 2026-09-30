public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        setNumeroCartao(numeroCartao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento Cartão de R$ " + valor + " processado no cartão final " + numeroCartao.substring(12));
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

}