import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class menorValor {
    public static void main(String[] args) {
        int valor1 = 5;
        int valor2 = 10;
        int valor3 = 3;
        
        int menor = valor1;
        
        if (valor2 < menor) {
            menor = valor2;
        }
        
        if (valor3 < menor) {
            menor = valor3;
        }
        
        System.out.println("O menor valor é: " + menor);
    }
}
