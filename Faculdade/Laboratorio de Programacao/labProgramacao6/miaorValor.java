import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class miaorValor {
    public static void main(String[] args) {
        int valor1 = 5;
        int valor2 = 10;
        int valor3 = 15;

        int maiorValor = valor1;

        if (valor2 > maiorValor) {
            maiorValor = valor2;
        }

        if (valor3 > maiorValor) {
            maiorValor = valor3;
        }

        System.out.println("O maior valor é: " + maiorValor);
    }
}
