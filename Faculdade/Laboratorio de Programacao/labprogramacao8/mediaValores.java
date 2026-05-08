import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class mediaValores{
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        int i, j, media = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite valores inteiros para compor a matriz: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
                media += matriz[i][j];
            }
        }

        media = media / 4;

        System.out.println("A media dos valores presentes nessa matriz e igual a: " + media);
    }
}