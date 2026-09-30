public abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldo) {
        setSaldo(saldo);
    }

    public abstract void descontarTarifa();

    public void depositar(double valor) {
        saldo += valor;
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}