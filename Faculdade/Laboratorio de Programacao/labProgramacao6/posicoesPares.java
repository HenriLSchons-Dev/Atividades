import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class posicoesPares {
    public static void main(String[] args) {
        double[] num = new double[5];
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 5 valores: ");
        for(i = 0; i < num.length; i++){
            num[i] = leia.nextDouble();
        }

        for(i = 2; i < num.length; i += 2){
            System.out.println("Os numeros armazenados nos indices pares do vetor sao: " + num[i]);
        }
    }
}
