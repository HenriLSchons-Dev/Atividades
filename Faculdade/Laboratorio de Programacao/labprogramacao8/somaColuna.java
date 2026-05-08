import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class somaColuna{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int i, j, soma;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite valores inteiros para compor a matriz: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
            }
        }

        for(j = 0; j < matriz[i].length; j++){
            soma = 0;
            for(i = 0; i < matriz.length; i++){
                soma += matriz[i][j];
            }
            System.out.println("A soma da coluna " + (j + 1) + " foi igual a: " + soma);
        }
    }
}