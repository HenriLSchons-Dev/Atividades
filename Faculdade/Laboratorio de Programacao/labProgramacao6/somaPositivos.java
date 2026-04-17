import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class somaPositivos {
    public static void main(String[] args) {
        int valor1 = 5;
        int valor2 = -10;
        int valor3 = 15;

        int somaPositivos = 0;

        if (valor1 > 0) {
            somaPositivos += valor1;
        }

        if (valor2 > 0) {
            somaPositivos += valor2;
        }

        if (valor3 > 0) {
            somaPositivos += valor3;
        }

        System.out.println("A soma dos valores positivos é: " + somaPositivos);
    }
}
