import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class vetorInvertido {
    public static void main(String[] args) {
        double[] vetor = new double[7];
        double[] inverso = new double[7];
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 7 valores: ");
        for(i = 0; i < vetor.length; i++){
            vetor[i] = leia.nextDouble();
        }
        System.out.print("O vetor inserido: ");
        for(i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + "; ");
        }

        System.out.println(" ");

        for(i = inverso.length - 1; i >= 0; i--){
            inverso[i] = vetor[i];
        }
        System.out.print("O inverso do vetor: ");
        for(i = 0; i < inverso.length; i++){
            System.out.print(inverso[i] + "; ");
        }
    }
}