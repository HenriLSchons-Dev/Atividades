import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class frequenciaNumero {
    public static void main(String[] args) {
        double[] vetor = new double[8];
        double busca;
        int i, aparece = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 8 valores: ");
        for(i = 0; i < vetor.length; i++){
            vetor[i] = leia.nextDouble();
        }

        System.out.println("Digite um numero para saber qunatas vezes ele aparece no vetor: ");
        busca = leia.nextDouble();

        for(i = 0; i < vetor.length; i++){
            if(busca == vetor[i]){
                aparece++;
            }
        }

        System.out.println("O valor aparece " + aparece + " vezes no vetor.");
    }
}