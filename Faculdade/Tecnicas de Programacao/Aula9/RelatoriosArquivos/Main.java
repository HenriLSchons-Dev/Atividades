public class Main{
    public static void main(String[] args) {
        String dados = "Vendas do mês: R$ 10.000";
        
        GeradorRelatorio pdf = new RelatorioPDF();
        GeradorRelatorio json = new RelatorioJSON();

        pdf.exportar(dados);
        json.exportar(dados);
    }
}