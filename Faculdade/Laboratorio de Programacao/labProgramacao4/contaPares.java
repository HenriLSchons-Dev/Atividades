import java.util.Scanner;
/**
 *
 * @author Henri Lopes Schons
 */
public class contaPares {

    public static void main(String[] args) {
        int num, i = 1, par = 0, divide;
        Scanner leia = new Scanner(System.in);
        
        while(i <= 5){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            divide = num % 2;
            
            if(divide == 0){
                par++;
            }
            i++;
        }
        System.out.println("Foram um total de " + par + " numeros pares!");
    }
}