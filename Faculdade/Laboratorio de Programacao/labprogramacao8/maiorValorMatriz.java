import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class maiorValorMatriz{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int i, j, maior = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite valores inteiros para compor a matriz: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
                
                if(maior < matriz[i][j]){
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("O maior valor presente na matriz foi: " + maior);
    }
}