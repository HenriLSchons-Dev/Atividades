import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class contarPositivos {
    public static void main(String[] args) {
        int[] numeros = {1, -2, 3, 4, -5, 6};
        int contadorPositivos = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                contadorPositivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contadorPositivos);
    }
}
