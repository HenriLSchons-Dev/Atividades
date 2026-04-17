import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class inverterValores {
    public static void main(String[] args) {
        int valor1 = 5;
        int valor2 = 10;

        // Invertendo os valores
        int temp = valor1;
        valor1 = valor2;
        valor2 = temp;

        System.out.println("Valor 1 após inversão: " + valor1);
        System.out.println("Valor 2 após inversão: " + valor2);
    }
}
