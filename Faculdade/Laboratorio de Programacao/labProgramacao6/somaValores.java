import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class somaValores {
    public static void main(String[] args) {
        int[] num = new int[5];
        int i, soma = 0;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite 5 numeros: ");
        for(i = 0; i < num.length; i++){
            num[i] = leia.nextInt();
        }

        for(i = 0; i < num.length; i++){
            soma += num[i];
        }
        System.out.println("A soma dos numeros digitados é: " + soma);
    }
}
