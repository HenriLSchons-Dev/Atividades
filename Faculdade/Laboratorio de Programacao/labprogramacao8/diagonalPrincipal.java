import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class diagonalPrincipal{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[] diagonal = new int[3];
        int i, j;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite valores inteiros para compor a matriz: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
                
                if(i == j){
                    diagonal[i] = matriz[i][j];
                }
            }
        }

        System.out.println("Os numeros presentes na diagonal principal da matriz sao: ");
        for(i = 0; i < diagonal.length; i++){
            System.out.print(diagonal[i] + "\t");
        }
    }
}