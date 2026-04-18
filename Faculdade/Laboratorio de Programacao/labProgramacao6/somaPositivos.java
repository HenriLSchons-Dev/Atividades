import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class somaPositivos {
    public static void main(String[] args) {
        double[] num = new double[5];
        double somaNum = 0;
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 5 numeros: ");
        for(i = 0; i < num.length; i++){
            num[i] = leia.nextDouble();
        }
        
        for(i = 0; i < num.length; i++){
            if(num[i] > 0){
                somaNum += num[i];
            }
        }

        System.out.println("A soma dos valores positivos é: " + somaNum);
    }
}
