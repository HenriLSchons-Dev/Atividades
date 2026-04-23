import java.util.Scanner;
/**
 *
 * @author Henri Lopes Schons
 */
public class leituraNumeros {

    public static void main(String[] args) {
        int i = 1, num;
        Scanner leia = new Scanner(System.in);
        
        while(i <= 5){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            System.out.println("Voce digitou: " + num);
            i++;
        }
    }
}