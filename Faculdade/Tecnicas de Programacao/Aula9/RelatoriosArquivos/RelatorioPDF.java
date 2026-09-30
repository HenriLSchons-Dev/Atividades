public class RelatorioPDF extends GeradorRelatorio {
    @Override
    public void exportar(String conteudo) {
        System.out.println("[PDF] O texto foi formatado em PDF: " + conteudo);
    }
}