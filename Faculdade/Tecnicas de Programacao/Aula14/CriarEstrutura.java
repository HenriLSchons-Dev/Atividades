import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CriarEstrutura{
    public static void main(String[] args){
        Path pasta = Path.of("estoque", "produtos");
        Path arquivo = pasta.resolve("produtos.txt");
    
        try{
            Files.createDirectories(pasta);

            if(Files.notExists(arquivo)){
                Files.createFile(arquivo);
            }
            System.out.println("Estrutura pronta: " + arquivo.toAbsolutePath());
            
        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}