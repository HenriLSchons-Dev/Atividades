
import java.util.Scanner;

/**
 * 
 * @author Henri Lopes Schons
 */
public class comparacaoVetores {
    public static void main(String[] args) {
        double[] primeiro = new double[5];
        double[] segundo = new double[5];
        int i, igual = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 5 numeros para o primeiro vetor: ");
        for(i = 0; i < primeiro.length; i++){
            primeiro[i] = leia.nextDouble();
        }

        System.out.println("Digite 5 numeros para o segundo vetor: ");
        for(i = 0; i < segundo.length; i++){
            segundo[i] = leia.nextDouble();
        }

        for(i = 0; i < primeiro.length; i++){
            if(primeiro[i] == segundo[i]){
                igual++;
            }
        }

        System.out.println("Analisando os dois vetores, temos " + igual + " numeros em posicoes iguais");
    }
}