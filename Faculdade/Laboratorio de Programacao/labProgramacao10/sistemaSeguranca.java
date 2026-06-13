import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class sistemaSeguranca {
    public static void main(String[] args) {
        int senhaCorreta = 1234, senhaDigitada, tentativas = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        senhaDigitada = leia.nextInt();
        tentativas++;

        while(senhaCorreta != senhaDigitada){ 
            System.out.println("Senha incorreta!");

            System.out.println("Digite a senha novamente: ");
            senhaDigitada = leia.nextInt();
            tentativas++;
        }

        System.out.println("Acesso autorizado!");
        System.out.println("Número de tentativas: " + tentativas);
    }
}