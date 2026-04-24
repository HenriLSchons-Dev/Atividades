import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class desafio {
    public static void main(String[] args) {
        double[] vetor = new double[10];
        double[] repete = new double[10];
        int i, j, w = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 10 valores: ");
        for(i = 0; i < vetor.length; i++){
            vetor[i] = leia.nextDouble();
        }

        for(i = 0; i < vetor.length; i++){
        boolean existe = false, repetido= false;
        
            for(j = 0; j < w; j++){
                if(repete[j] == vetor[i]){
                    existe = true;
                }
            }

            for(j = i + 1; j < vetor.length; j++){
                if(vetor[i] == vetor[j]){
                    repetido = true;
                }
            }

            if(existe == false && repetido){
                repete[w] = vetor[i];
                w++;
            }
        } 

        System.out.println("Os valores que aparecem mais de uma vez sao: ");
        for(i = 0; i < w; i++){ 
            System.out.print(repete[i] + "; ");
        }
    }
}