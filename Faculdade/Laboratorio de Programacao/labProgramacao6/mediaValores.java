import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class mediaValores {
    public static void main(String[] args) {
        double[] num = new double[5];
        double media = 0;
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 5 numeros: ");
        for(i = 0; i < num.length; i++){
            num[i] = leia.nextDouble();
            media += num[i];
        }
        
        System.out.println("A media dos numeros digitados é: " + media);
    }
}
