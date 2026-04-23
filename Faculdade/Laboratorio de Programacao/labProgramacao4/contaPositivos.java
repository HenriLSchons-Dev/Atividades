import java.util.Scanner;
/**
 *
 * @author Henri Lopes Schons
 */
public class contaPositivos {

    public static void main(String[] args) {
        int num, i = 1, positivos = 0;
        Scanner leia = new Scanner(System.in);
        
        while(i <= 5){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            if(num > 0){
                positivos++;
            }
            i++;
        }
        System.out.println("Foram um total de " + positivos + " numeros positivos!");
    }
}
