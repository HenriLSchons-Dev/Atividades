public class RelatorioJSON extends GeradorRelatorio {
    @Override
    public void exportar(String conteudo) {
        System.out.println("[JSON] O texto foi estruturado em JSON: {\"texto\": \"" + conteudo + "\"}");
    }
}