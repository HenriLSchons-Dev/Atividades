import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class desafioFinal{
    public static void main(String[] args) {
        int[][] matriz = {
            {7, 2, 9, 4, 1},
            {5, 8, 3, 0, 6},
            {2, 1, 7, 9, 4},
            {8, 6, 0, 3, 5},
            {4, 9, 2, 1, 7}
        };
        int i, j, linha, coluna, soma = 0;
        boolean valorEncontrado = false;
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe qual linha, e qual coluna deseja:");
        linha = leia.nextInt();
        coluna = leia.nextInt();

        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){

                if(linha == i && coluna == j){
                    valorEncontrado = true;
                    System.out.println("O valor encontrado e: " + matriz[i][j]);
                }

                if(linha )

            }
        }
    }
}