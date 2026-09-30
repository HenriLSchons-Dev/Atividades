public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        setValor(valor);
    }

    public abstract void processarPagamento();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}