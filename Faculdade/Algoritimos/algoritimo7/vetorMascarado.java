import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class vetorMascarado{
    public static void main(String[] args){
        double[] vetor = new double[8];
        int i;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite 8 valores quais quer: ");
        for(i = 0; i < vetor.length; i++){
            vetor[i] = leia.nextDouble();

            if(vetor[i] > 0){
                vetor[i] = 1;
            }
            else{
                vetor[i] = 0;
            }
        }

        System.out.println("Convertendo positivos para 1, e negativos para 0.......");
        System.out.print("O vetor final e: ");
        for(i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + ", ");
        }
    }
}