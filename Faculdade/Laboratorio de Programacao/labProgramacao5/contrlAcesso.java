import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class contrlAcesso {

    public static void main(String[] args) {
        int senhaCerta = 2026, senha;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Digite a senha: ");
            senha = leia.nextInt();
        }while(senha != senhaCerta);
        System.out.println("Acesso liberado!");
    }
}