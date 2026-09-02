public class GestorOutorga {

    public double calculoCustoBaseAgua(double volumeCaptacaoHoje, double precoBaseM3) {
        return volumeCaptacaoHoje * precoBaseM3;
    }

    public double calculoSobretaxa(double volumeCaptacaoHoje, double limiteOutorga, double precoBaseM3) {
        double excedente = volumeCaptacaoHoje - limiteOutorga;

        if (excedente <= 0) {
            return 0;
        }

        double porcentagem = volumeCaptacaoHoje / limiteOutorga;

        if (porcentagem <= 1.15) {
            return excedente * precoBaseM3 * 0.50;

        } else if (porcentagem <= 1.25) {
            return excedente * precoBaseM3 * 1.50;

        } else {

            return 0;
        }
    }

    public double calcularTotal(double volumeCaptacaoHoje, double limiteOutorga, double precoBaseM3) {

        double custoBase = calculoCustoBaseAgua(volumeCaptacaoHoje, precoBaseM3);

        double sobretaxa = calculoSobretaxa(volumeCaptacaoHoje, limiteOutorga, precoBaseM3 );

        return custoBase + sobretaxa;
    }   

    public void emitirRelatorio(PontoCaptacaoRio ponto) {
        double custoBase = calculoCustoBaseAgua( ponto.getvolumeCaptacaoRio(), ponto.getPrecoBaseM3());
        double sobretaxa = calculoSobretaxa(ponto.getvolumeCaptacaoRio(), ponto.getLimiteOutorga(), ponto.getPrecoBaseM3());
        double excedente = ponto.getvolumeCaptacaoRio() - ponto.getLimiteOutorga();

        if (excedente < 0) {
            excedente = 0;
        }

        double total = custoBase + sobretaxa;

        System.out.println("==================================================");
        System.out.println("       RELATORIO DE CAPTACAO E OUTORGA HIDRICA");
        System.out.println("==================================================");
        System.out.printf("Ponto de Captacao ID: %d (%s)%n", ponto.getIdPonto(), ponto.getNomeRio());
        System.out.printf("Cultura Irrigada       : %s%n", ponto.getCulturaIrrigada());
        System.out.printf("Limite Autorizado      : %.2f m³%n", ponto.getLimiteOutorga());
        System.out.printf("Volume Retirado Hoje   : %.2f m³%n", ponto.getvolumeCaptacaoRio());
        System.out.printf("Status Operacional     : %s%n", ponto.getStatus());
        System.out.println(" ");
        System.out.printf("Custo Base da Agua     : R$ %.2f%n", custoBase);
        System.out.printf("Sobretaxa Ambiental    : R$ %.2f%n", sobretaxa);
        System.out.printf("Volume Excedente       : %.2f m³%n", excedente);
        System.out.printf("TOTAL A PAGAR          : R$ %.2f%n", total);
        System.out.println("==================================================");
    }
}