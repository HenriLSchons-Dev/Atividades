public class FreteExpress extends CalculoFrete implements Rastreio, Agendar {

    private String codigoRastreio;
    private String dataAgendada;

    public FreteExpress(String cep, double pesoKg) {
        super(cep, pesoKg);
    }

    @Override
    public double calcularFrete() {
        return getTaxaOperacional() + (getPesoKg() * 18.00);
    }

    @Override
    public String gerarCodigoRastreio() {
        codigoRastreio = "EXP" + getCep().replaceAll("\\D", "") + "BR";
        return codigoRastreio;
    }

    @Override
    public String consultarStatus(String codigoRastreio) {
        if (this.codigoRastreio != null && this.codigoRastreio.equals(codigoRastreio)) {
            return "Saiu para entrega";
        }
        return "Código de rastreio não encontrado";
    }

    @Override
    public String agendarEntrega(String dataHora) {
        dataAgendada = dataHora;
        return "Entrega agendada para " + dataAgendada;
    }
}