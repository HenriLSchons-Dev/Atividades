public class ContaBancaria{
    protected int numeroConta;
    protected double saldo;

    public ContaBancaria(){

    }

    public ContaBancaria(int numeroConta, double saldo){
        setNumeroConta(numeroConta);
        setSaldo(saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        saldo += deposito;
        System.out.println("Deposito realizado!");
    }

    public void sacar(double saque){
        saldo -= saque;
        System.out.println("Saque realizado!");
    }

}