import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class contaNumerosPositivos{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int i, j, conta = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite valores inteiros para compor a matriz: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
                
                if(matriz[i][j] >= 0){
                    conta++;
                }
            }
        }

        System.out.println("A quantidade de numeros positivos presentes na matriz foram: " + conta);
    }
}