public class Correios extends CalculoFrete implements Rastreio, Desconto {

    private String codigoRastreio;

    public Correios(String cep, double pesoKg) {
        super(cep, pesoKg);
    }

    public double calcularFrete() {
        return getTaxaOperacional() + (getPesoKg() * 8.00);
    }

    @Override
    public String gerarCodigoRastreio() {
        codigoRastreio = "COR" + getCep().replaceAll("\\D", "") + "BR";
        return codigoRastreio;
    }

    @Override
    public String consultarStatus(String codigoRastreio) {
        if (this.codigoRastreio != null && this.codigoRastreio.equals(codigoRastreio)) {
            return "Objeto em trânsito";
        }
        return "Código de rastreio não encontrado";
    }

    @Override
    public double aplicarDesconto(double valorFrete, double percentual) {
        return valorFrete - (valorFrete * percentual / 100);
    }
}