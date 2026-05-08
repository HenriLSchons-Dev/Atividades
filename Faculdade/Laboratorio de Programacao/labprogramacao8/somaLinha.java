import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class somaLinha{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int i, j, soma;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite valores inteiros para compor a matriz: ");
        for(i = 0; i < matriz.length; i++){
            soma = 0;

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
                soma += matriz[i][j];
            }

            System.out.println("A soma da linha" + (i + 1) +" foi: " + soma);
        }

    }
}