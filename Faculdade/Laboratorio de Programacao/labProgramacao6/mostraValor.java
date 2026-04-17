import java.util.Scanner;

/** 
 * 
 * @author Henri Lopes Schons
*/
public class mostraValor {
    public static void main(String[] args) {
        int[] num = new int[5];
        int i;
        Scanner leia = new Scanner(System.in);
         Sistem.out.println("Digite um numero: ");        
        for(i = 0; i < num.length; i++){
            num[i] = leia.nextInt();
        }
        for(i = 0; i < num.length; i++){
            System.out.println("Os numeros digitado foram: " + num[i]);
        }
    }
}
