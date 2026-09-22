public class ContaPoupanca extends ContaBancaria{
    protected double taxaRendimento;

    public ContaPoupanca(){

    }

    public ContaPoupanca(int numeroConta, double saldo, double taxaRendimento){
        super(numeroConta, saldo);
        setTaxaRendimento(taxaRendimento);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        saldo = saldo * (1 + taxaRendimento);
        System.out.println("Rendimento aplicado");
    }

    public void exibirSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }

}