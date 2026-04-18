import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class inverterValores {
    public static void main(String[] args) {
        double[] inverso = new double[5];
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 5 numeros: ");
        for(i = 0; i < inverso.length; i++){
            inverso[i] = leia.nextDouble();
        }

        System.out.println("Os numeros na ordem inversa digitada: ");
        for(i = inverso.length - 1; i >= 0; i--){
            System.out.println(inverso[i]);
        }
    }
}
