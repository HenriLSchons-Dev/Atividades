import java.util.Scanner;
/**
 *
 * @author Henri Lopes Schons
 */
public class repetirMensagem {

    public static void main(String[] args) {
        int num, i = 1;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        num = leia.nextInt();
        while(i <= num){
            System.out.println("Olá!");
            i++;
        }
    }
}