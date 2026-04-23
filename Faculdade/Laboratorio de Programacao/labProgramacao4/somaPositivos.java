import java.util.Scanner;
/**
 *
 * @author Henri Lopes Schons
 */
public class somaPositivos {

    public static void main(String[] args) {
        int soma = 0, num, i = 1;
        Scanner leia = new Scanner(System.in);
        
        while(i <= 5){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            if(num > 0){
                soma = soma + num;
            }
            i++;
        }
        System.out.println("Foram um total de " + soma + " somando os numeros positivos");
    }
}