public class RetiradaLoja extends CalculoFrete implements Desconto {

    public RetiradaLoja(String cep, double pesoKg) {
        super(cep, pesoKg);
    }

    @Override
    public double calcularFrete() {
        return 0.0;
    }

    @Override
    public double aplicarDesconto(double valorFrete, double percentual) {
        return valorFrete - (valorFrete * percentual / 100);
    }
}