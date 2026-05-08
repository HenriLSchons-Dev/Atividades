import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class multiplicaPorDois{
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int i, j, multiplica;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite valores inteiros para compor a matriz: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                multiplica = leia.nextInt();
                multiplica = multiplica * 2;
                matriz[i][j] = multiplica;
            }
        }

        System.out.println("Depois de multiplicar por 2 cada um dos valores, a matriz ficou assim: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}