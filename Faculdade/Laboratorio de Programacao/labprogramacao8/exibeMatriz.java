import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class exibeMatriz{
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        int i, j;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite valores inteiros para compor a matriz: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
            }
        }

        System.out.println("A matriz formada foi: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}