import java.util.Scanner;
/**
 *
 * @author Henri Lopes Schons
 */
public class somaAteZero {

    public static void main(String[] args) {
        int soma = 0, num = 1;
        Scanner leia = new Scanner(System.in);
        
        while(num != 0){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            soma = soma + num;
        }
        System.out.println("A soma de seus numeros é: " + soma);
    }
}

