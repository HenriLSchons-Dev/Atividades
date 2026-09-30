public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void descontarTarifa() {
        System.out.println("Conta Poupança é isenta de tarifas.");
    }
}