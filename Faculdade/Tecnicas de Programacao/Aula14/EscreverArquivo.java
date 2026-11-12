import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EscreverArquivo {
    public static void main(String[] Args){
        Path arquivo = Path.of("estoque", "produtos", "produtos.txt");
        String dados = "201;Teclado;89.90\n202;Mouse;49.90\n203;Monitor;799.90\n";

        try{
            Files.createDirectories(arquivo.getParent());
            Files.writeString(arquivo, dados);
            System.out.println("Dados gravados com sucesso!");
        } catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
