public class Main{
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(100.00);
        ContaBancaria cp = new ContaPoupanca(100.00);

        cc.depositar(50.00);
        cp.depositar(50.00);

        cc.descontarTarifa();
        cp.descontarTarifa();

        cc.exibirSaldo();
        cp.exibirSaldo();
    }
}