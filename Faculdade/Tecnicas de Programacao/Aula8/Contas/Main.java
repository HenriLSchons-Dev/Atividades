public class Main{
    public static void main(String[] args){
        ContaPoupanca conta = new ContaPoupanca(01, 67.42, 0.1375);

        conta.depositar(32.58);
        conta.exibirSaldo();
        conta.aplicarRendimento();
        conta.exibirSaldo();
    }
}