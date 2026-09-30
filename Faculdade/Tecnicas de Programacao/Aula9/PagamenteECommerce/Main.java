public class Main{
    public static void main(String[] args) {
        Pagamento pix = new PagamentoPix(150.00, "email@exemplo.com");
        Pagamento cartao = new PagamentoCartao(250.00, "1234567812345678");

        pix.processarPagamento();
        cartao.processarPagamento();
    }
}