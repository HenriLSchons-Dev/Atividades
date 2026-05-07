import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class orientacaoLiDAR{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[] vetor = new int[3];
        int[][] rotacionada = new int[3][3];
        int i, j, coluna = 2;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira 1 para obstaculo e 0 pra vazio: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
            }
        }

        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[i].length; j++){
                vetor[j] = matriz[i][j];
            }
            for(j = 0; j < vetor.length; j++){
                rotacionada[j][coluna] = vetor[j];
            }
            coluna--;
        }

        System.out.println("A matriz rotacionada: ");
        for(i = 0; i < rotacionada.length; i++){
            
            for(j = 0; j < rotacionada[i].length; j++){
                System.out.print(rotacionada[i][j] + "; ");
            }
            System.out.println();
        }
    }
}