import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AcrescentarArquivo {
    public static void main(String[] Args){
        Path arquivo = Path.of("estoque", "produtos", "produtos.txt");
        String novoProduto = "204;WebCam;149.90\n";

        try {
            Files.createDirectories(arquivo.getParent());
            Files.writeString(arquivo, novoProduto, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Informações adicionadas com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
