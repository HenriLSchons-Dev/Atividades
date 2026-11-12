import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LerArquivo {
    public static void main(String[] args) {
        Path arquivo = Path.of("estoque", "produtos", "produtos.txt");

        try {
            List<String> linhas = Files.readAllLines(arquivo);

            System.out.println("======= PRODUTOS EM ESTOQUE =======");
            for(String linha : linhas){
                System.out.println(linha);
                System.out.println("====================================");
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
