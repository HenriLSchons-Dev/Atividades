import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class somaIndicesPares {
    public static void main(String[] args) {
        double[] valor = new double[6];
        double somaPar = 0, somaImpar = 0;
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 6 valores: ");
        for(i = 0; i < valor.length; i++){
            valor[i] = leia.nextDouble();

            if(i % 2 == 0){
                somaPar += valor[i];
            }
            else{
                somaImpar += valor[i];
            }
        }
        
        System.out.println("A soma dos numeros que estao em indices pares e: " + somaPar);
        System.out.println("A soma dos numeros que estao em indices impares e: " + somaImpar);
    }
}