import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class posicoesPares {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60};
        
        System.out.println("Números nas posições pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
