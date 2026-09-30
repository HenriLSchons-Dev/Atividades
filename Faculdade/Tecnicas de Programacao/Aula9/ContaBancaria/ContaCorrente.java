public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void descontarTarifa() {
        saldo -= 20.00;
        System.out.println("Tarifa de R$ 20,00 descontada da Conta Corrente.");
    }
}