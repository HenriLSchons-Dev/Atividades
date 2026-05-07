import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class transpostaRelatorio{
    public static void main(String[] args) {
        int[][] transposta = new int[2][3];
        int i, j;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite numeros inteiros para compor a matriz: ");
        for(i = 0; i < transposta.length; i++){

            for(j = 0; j < transposta[i].length; j++){
                transposta[i][j] = leia.nextInt();
            }
        }

        for(j = 0; j < transposta.length; j++){

            for(i = 0; i < transposta[j].length; i++){
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}