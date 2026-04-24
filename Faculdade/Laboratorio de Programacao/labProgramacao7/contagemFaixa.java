import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class contagemFaixa {
    public static void main(String[] args) {
        double[] num = new double[10];
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 10 valores: ");
        for(i = 0; i < num.length; i++){
            num[i] = leia.nextDouble();
        }

    }
}