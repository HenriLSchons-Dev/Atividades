
import java.util.Scanner;

/**
 * 
 * @author Henri Lopes Schons
 */
public class estabilidadeEstrutural{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int i, j, determinante;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 9 valores inteiros para matriz: ");
        for(i = 0; i < matriz.length; i++){
            
            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
            }
        }

        determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2]) + 
        (matriz[0][1] * matriz[1][2] * matriz[2][0]) + 
        (matriz[0][2] * matriz[1][0] * matriz[2][1]) -
        (matriz[0][2] * matriz[1][1] * matriz[2][0]) -
        (matriz[0][0] * matriz[1][2] * matriz[2][1])-
        (matriz[0][1] * matriz[1][0] * matriz[2][2]);

        System.out.println("A determinante e: " + determinante);
        if(determinante == 0){
            System.out.println("Necessita de revisao tecnica. Ass: Henri");
        }
        else{
            System.out.println("Estrutura estavel");
        }
    }
}