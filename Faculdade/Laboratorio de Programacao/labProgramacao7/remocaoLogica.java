import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class remocaoLogica {
    public static void main(String[] args) {
        double[] vetor = new double[6];
        double remover;
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 6 valores: ");
        for(i = 0; i < vetor.length; i++){
            vetor[i] = leia.nextDouble();
        }

        System.out.println("Qual valor deseja remover do seu vetor?");
        remover = leia.nextDouble();

        for(i = 0; i < vetor.length; i++){
            if(remover == vetor[i]){
                vetor[i] = 0;
            }
            else{
                System.out.println("Numero nao encontrado!");
            }
        }

        System.out.println("Com a remocao do numero, o vetor fica: ");
        for(i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + "; ");
        }
    }
}