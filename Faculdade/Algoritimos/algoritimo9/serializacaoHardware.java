import java.util.Scanner;
public class serializacaoHardware{
    public static void main(String[] args) {
        int[][] original = {
            {9, 3, 19, 54},
            {13, 6, 8, 2},
            {17, 7, 4, 1},
            {0, 5, 16, 9}
        };
        int[] vetor = new int[16];
        int i, j, k = 0;
        Scanner leia = new Scanner(System.in);

        for(i = 0; i < original.length; i++){
            for(j = 0; j < original[i].length; j++){
                vetor[k] = original[i][j];
                k++;
            }
        }
        System.out.println("O vetor 1D gerado: ");
        for(i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + "; ");
        }
        System.out.println();
        
        k = 0;

        System.out.println("Digite novos 16 valores inteiros para o vetor: ");
        for(i = 0; i < vetor.length; i++){
            vetor[i] = leia.nextInt();
        }
        for(i = 0; i < original.length; i++){
            for(j = 0; j < original[i].length; j++){
                original[i][j] = vetor[k];
                k++;
            }
        }
        System.out.println("Nova matriz: ");
        for(i = 0; i < original.length; i++){
            
            for(j = 0; j < original[i].length; j++){
                System.out.print(original[i][j] + "; ");
            }
            System.out.println();
        }
    }
}